package com.welife.rest.service.impl;

import com.welife.common.utils.ExceptionUtil;
import com.welife.common.utils.WeLifeResult;
import com.welife.rest.dao.JedisClient;
import com.welife.rest.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author Creeper
 * @date 17-11-9 上午9:59
 * @since 1.8.0_151
 */
@Service
public class RedisServiceImpl implements RedisService {

    @Autowired
    private JedisClient jedisClient;

    @Value("${INDEX_CONTENT_REDIS_KEY}")
    private String INDEX_CONTENT_REDIS_KEY;

    /**
     * 商品内容
     * @param contentCid
     * @return
     */
    @Override
    public WeLifeResult syncContent(Long contentCid) {
        try {
            jedisClient.hdel(INDEX_CONTENT_REDIS_KEY, contentCid + "");
        } catch (Exception e) {
            e.printStackTrace();
            return WeLifeResult.build(500, ExceptionUtil.getStackTrace(e));
        }

        return WeLifeResult.ok();
    }
}
