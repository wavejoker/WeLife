package com.welife.rest.service.impl;

import com.welife.common.utils.JsonUtils;
import com.welife.mapper.WeProductCategoryMapper;
import com.welife.pojo.WeProductCategory;
import com.welife.pojo.WeProductCategoryExample;
import com.welife.rest.dao.JedisClient;
import com.welife.rest.pojo.CatNode;
import com.welife.rest.pojo.CatResult;
import com.welife.rest.service.ProductCatService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Creeper
 * @date 17-11-10 下午7:20
 * @since 1.8.0_151
 */
@Service
public class ProductCatServiceImpl implements ProductCatService {

    @Autowired
    private WeProductCategoryMapper productCategoryMapper;
    @Autowired
    private JedisClient jedisClient;

    @Value("${INDEX_ITEMCAT_REDIS_KEY}")
    private String INDEX_ITEMCAT_REDIS_KEY;

    @Override
    public CatResult getProductItemList() {
        CatResult catResult = new CatResult();
        catResult.setData(getCatList(0));

        return catResult;
    }

    private List<?> getCatList(long parentId) {
        //从redis缓存中获取分类列表
        try {
            String resultString = jedisClient.hget(INDEX_ITEMCAT_REDIS_KEY, parentId + "");
            if (!StringUtils.isBlank(resultString)) {
                return JsonUtils.jsonToList(resultString, Object.class);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 创建查询条件
        WeProductCategoryExample example = new WeProductCategoryExample();
        WeProductCategoryExample.Criteria criteria = example.createCriteria();
        criteria.andParentIdEqualTo(parentId);
        // 执行查询
        List<WeProductCategory> list = productCategoryMapper.selectByExample(example);
        // 返回值List
        List<Object> resultList = new ArrayList<>();
        // 向List中添加节点
        // 添加计数器,只显示14条记录
        int count = 0;
        for (WeProductCategory productCategory : list) {
            // 判断是否为父节点
            if (productCategory.getIsParent()) {

                CatNode catNode = new CatNode();

                if (parentId == 0) {
                    catNode.setName(
                            "<a href='/products/" + productCategory.getId() + ".html'>" + productCategory.getName() + "</a>");
                } else {
                    catNode.setName(productCategory.getName());
                }
                catNode.setUrl("/products/" + productCategory.getId() + ".html");
                catNode.setItem(getCatList(productCategory.getId()));
                resultList.add(catNode);
                count++;
                if (parentId == 0 && count >= 14) {
                    break;
                }
            } else {
                // 如果是叶子节点
                resultList.add("/products/" + productCategory.getId() + ".html|" + productCategory.getName());
            }
        }
        //向Redis中添加缓存
        try {
            String string = JsonUtils.objectToJson(resultList);
            jedisClient.hset(INDEX_ITEMCAT_REDIS_KEY, parentId + "", string);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultList;
    }
}
