package com.welife.rest.service.impl;

import com.welife.common.utils.WeLifeResult;
import com.welife.rest.dao.JedisClient;
import com.welife.rest.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author Creeper
 * @date 17-11-10 下午7:53
 * @since 1.8.0_151
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private JedisClient jedisClient;

    @Value("${REDIS_PRODUCT_KEY}")
    private String REDIS_PRODUCT_KEY;
    @Value("${REDIS_PRODUCT_EXPIRE}")
    private String REDIS_PRODUCT_EXPIRE;

    @Override
    public WeLifeResult getProductBaseInfo(Long productId) {
        // 从缓存中取商品信息，商品id对应的信息
        String json = jedisClient.get(REDIS_PRODUCT_KEY + ":" + productId + ":base");


        return null;
    }

    @Override
    public WeLifeResult getProductDesc(Long productId) {
        return null;
    }

    @Override
    public WeLifeResult getProductParam(Long productId) {
        return null;
    }
}
