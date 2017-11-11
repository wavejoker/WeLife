package com.welife.rest.service.impl;

import com.welife.common.utils.JsonUtils;
import com.welife.common.utils.WeLifeResult;
import com.welife.mapper.WeProductDescMapper;
import com.welife.mapper.WeProductMapper;
import com.welife.mapper.WeProductParamMapper;
import com.welife.pojo.WeProduct;
import com.welife.pojo.WeProductDesc;
import com.welife.pojo.WeProductParam;
import com.welife.rest.dao.JedisClient;
import com.welife.rest.service.ProductService;
import org.apache.commons.lang3.StringUtils;
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
    @Autowired
    private WeProductMapper productMapper;
    @Autowired
    private WeProductDescMapper productDescMapper;
    @Autowired
    private WeProductParamMapper productParamMapper;

    @Value("${REDIS_PRODUCT_KEY}")
    private String REDIS_PRODUCT_KEY;
    @Value("${REDIS_PRODUCT_EXPIRE}")
    private Integer REDIS_PRODUCT_EXPIRE;

    @Override
    public WeLifeResult getProductBaseInfo(Long productId) {
        try {
            // 从缓存中取商品信息，商品id对应的信息
            String json = jedisClient.get(REDIS_PRODUCT_KEY + ":" + productId + ":base");
            if (!StringUtils.isBlank(json)) {
                //将json转换为Java对象
                WeProduct product = JsonUtils.jsonToPojo(json, WeProduct.class);
                return WeLifeResult.ok(product);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        WeProduct product = productMapper.selectByPrimaryKey(productId);
        try {
            //将商品信息写入redis Key的命名方式:REDIS_ITEM_KEY:productId:base:info
            jedisClient.set(REDIS_PRODUCT_KEY + ":" + productId + ":base", JsonUtils.objectToJson(product));
            jedisClient.expire(REDIS_PRODUCT_KEY + ":" + ":base", REDIS_PRODUCT_EXPIRE);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //使用WeLifeResult包装并返回
        return WeLifeResult.ok(product);
    }

    @Override
    public WeLifeResult getProductDesc(Long productId) {
        //从缓存中获取数据
        try {
            //如果缓存中存在该记录则返回
            String json = jedisClient.get(REDIS_PRODUCT_KEY + ":" + productId + ":desc");
            if (StringUtils.isBlank(json)) {
                WeProductDesc productDesc = JsonUtils.jsonToPojo(json, WeProductDesc.class);
                return WeLifeResult.ok(productDesc);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        WeProductDesc productDesc = productDescMapper.selectByPrimaryKey(productId);
        //写入缓存
        try {
            jedisClient.set(REDIS_PRODUCT_KEY + ":" + productId + ":desc", JsonUtils.objectToJson(productDesc));
            jedisClient.expire(REDIS_PRODUCT_KEY + ":" + productId + ":desc", REDIS_PRODUCT_EXPIRE);
        }catch (Exception e){
            e.printStackTrace();
        }
        return WeLifeResult.ok(productDesc);
    }

    @Override
    public WeLifeResult getProductParam(Long productId) {
        //从缓存中获取数据
        try {
            //如果缓存中存在该记录则返回
            String json = jedisClient.get(REDIS_PRODUCT_KEY + ":" + productId + ":param");
            if (StringUtils.isBlank(json)) {
                WeProductParam productParam = JsonUtils.jsonToPojo(json, WeProductParam.class);
                return WeLifeResult.ok(productParam);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        WeProductParam productParam = productParamMapper.selectByPrimaryKey(productId);
        //写入缓存
        try {
            jedisClient.set(REDIS_PRODUCT_KEY + ":" + productId + ":param", JsonUtils.objectToJson(productParam));
            jedisClient.expire(REDIS_PRODUCT_KEY + ":" + productId + ":param", REDIS_PRODUCT_EXPIRE);
        }catch (Exception e){
            e.printStackTrace();
        }
        return WeLifeResult.ok(productParam);
    }
}
