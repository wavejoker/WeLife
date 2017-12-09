package com.welife.service;

import com.welife.common.pojo.EasyUIResult;
import com.welife.common.utils.WeLifeResult;
import com.welife.pojo.WeProduct;

/**
 * 商品管理服务
 * @author : Creeper
 * @date : 17-10-22 下午10:23
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
    WeProduct getProductById(Long productId);

    /**
     * 新建商品条目
     * @param product
     * @param desc
     * @return
     * @throws Exception
     */
    WeLifeResult creatProduct(WeProduct product, String desc) throws Exception;

    /**
     * 根据商品ID查询商品描述
     * @param productId
     * @return
     */
    WeLifeResult getProductDescById(Long productId);

    /**
     * 根据商品ID获取商品参数
     * @param productId
     * @return
     */
    WeLifeResult getProductParamItemById(Long productId);

    /**
     * 根据商品ID更新商品信息
     * @param product
     * @return
     */
    WeLifeResult updateProductById(WeProduct product);


}
