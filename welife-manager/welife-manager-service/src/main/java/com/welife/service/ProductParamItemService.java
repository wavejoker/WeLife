package com.welife.service;

/**
 * 商品参数条目服务
 * @author Creeper
 * @date 17-10-31 下午3:20
 * @since 1.8.0_151
 */
public interface ProductParamItemService {
    /**
     * 根据商品ID获取商品参数
     * @param productId
     * @return
     */
    String getProductParamByProductId(Long productId);

}
