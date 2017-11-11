package com.welife.rest.service.impl;

import com.welife.common.utils.JsonUtils;
import com.welife.mapper.WeContentMapper;
import com.welife.pojo.WeContent;
import com.welife.pojo.WeContentExample;
import com.welife.rest.dao.JedisClient;
import com.welife.rest.service.ContentService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Creeper
 * @date 17-11-9 下午7:09
 * @since 1.8.0_151
 */
@Service
public class ContentServiceImpl implements ContentService {

    @Autowired
    private WeContentMapper contentMapper;

    @Autowired
    private JedisClient jedisClient;

    @Value("${INDEX_CONTENT_REDIS_KEY}")
    private String INDEX_CONTENT_REDIS_KEY;

    @Override
    public List<WeContent> getContentList(Long categroyId) {
        try {
            String result = jedisClient.hget(INDEX_CONTENT_REDIS_KEY, categroyId + "");
            if (!StringUtils.isBlank(result)) {
                List<WeContent> resultList = JsonUtils.jsonToList(result, WeContent.class);
                return resultList;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        WeContentExample example = new WeContentExample();
        WeContentExample.Criteria criteria = example.createCriteria();
        criteria.andCategoryIdEqualTo(categroyId);
        //根据内容分类ID查询内容分类列表
        List<WeContent> list = contentMapper.selectByExampleWithBLOBs(example);
        //向缓存中添加内容
        try {
            // 将list转换成字符串
            String cacheString = JsonUtils.objectToJson(list);
            jedisClient.hset(INDEX_CONTENT_REDIS_KEY, categroyId + "", cacheString);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}

