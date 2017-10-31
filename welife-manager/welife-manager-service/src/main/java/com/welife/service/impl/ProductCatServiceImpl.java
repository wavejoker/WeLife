package com.welife.service.impl;

import com.welife.common.pojo.EUTreeNode;
import com.welife.common.utils.WeLifeResult;
import com.welife.mapper.WeProductCategoryMapper;
import com.welife.pojo.WeProductCategory;
import com.welife.pojo.WeProductCategoryExample;
import com.welife.service.ProductCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Creeper
 * @DesCription:
 * @Date: 17-10-23 上午11:08
 * @Modified By:
 */
@Service
public class ProductCatServiceImpl implements ProductCatService {
    @Autowired
    private WeProductCategoryMapper weProductCategoryMapper;

    @Override
    public List<EUTreeNode> getCatList(Long parentId) {
        WeProductCategoryExample example = new WeProductCategoryExample();
        WeProductCategoryExample.Criteria criteria = example.createCriteria();
        criteria.andParentIdEqualTo(parentId);
        List<WeProductCategory> productCategories = weProductCategoryMapper.selectByExample(example);
        List<EUTreeNode> treeNodes = new ArrayList<>();
        for (WeProductCategory productCategory : productCategories) {
            //创建一个treeNode对象
            EUTreeNode node = new EUTreeNode();
            node.setParentId(productCategory.getParentId());
            node.setId(productCategory.getId());
            node.setText(productCategory.getName());
            node.setState(productCategory.getIsParent() ? "closed" : "open");
            treeNodes.add(node);
        }
        return treeNodes;
    }

    @Override
    public WeLifeResult getProductParamNameById(Long id) {
        return null;
    }
    @Override
    public String getProductCatNameById(Long id) {
        String name = weProductCategoryMapper.selectNameByPrimaryKey(id);
        return name;
    }

}
