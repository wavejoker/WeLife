package com.welife.rest.service;

import com.welife.rest.pojo.CatResult;

/**
 * 商品分类Service
 * @author Creeper
 * @date 17-11-10 下午7:16
 * @since 1.8.0_151
 */
public interface ProductCatService {

    /**
     * 获取商品分类列表
     * @return
     */
    CatResult getProductItemList();

}
