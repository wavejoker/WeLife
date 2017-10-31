package com.welife.service;

import com.welife.common.pojo.EasyUIResult;
import com.welife.common.utils.WeLifeResult;
import com.welife.pojo.WeProduct;

/**
 * @Author: Creeper
 * @DesCription: 商品管理服务
 * @Date: 17-10-22 下午10:23
 * @Modified By:
 */
public interface ProductService {

    /**
     * 获取商品列表
     * @param pages
     * @param rows
     * @return
     */
    EasyUIResult getProductList(Integer pages, Integer rows);

    /**
     * 根据商品ID获取商品
     * @param productId
     * @return
     */
    WeProduct getProductById(long productId);

    /**
     * 新建商品条目
     * @param product
     * @param desc
     * @return
     * @throws Exception
     */
    WeLifeResult creatProduct(WeProduct product, String desc) throws Exception;
}
