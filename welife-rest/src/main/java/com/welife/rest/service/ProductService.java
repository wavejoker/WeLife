package com.welife.rest.service;

import com.welife.common.utils.WeLifeResult;

/**
 * 商品信息服务Service
 * @author Creeper
 * @date 17-11-10 下午7:51
 * @since 1.8.0_151
 */
public interface ProductService {
    /**
     * 根据商品ID获取商品基本信息
     * @param productId
     * @return
     */
    WeLifeResult getProductBaseInfo(Long productId);

    /**
     * 根据商品ID获取商品描述信息
     * @param productId
     * @return
     */
    WeLifeResult getProductDesc(Long productId);

    /**
     * 根据商品ID获取商品参数信息
     * @param productId
     * @return
     */
    WeLifeResult getProductParam(Long productId);

    WeLifeResult deleteProduct(Long[] ids);
}
