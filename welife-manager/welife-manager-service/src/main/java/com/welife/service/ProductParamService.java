package com.welife.service;

import com.welife.common.pojo.EasyUIResult;
import com.welife.common.utils.WeLifeResult;
import com.welife.pojo.WeProductParam;

/**
 * 商品参数Service
 *
 * @author Creeper
 * @date 17-10-25 下午5:06
 * @since 1.8.0_151
 */
public interface ProductParamService {
    /**
     * 获取商品的参数分类列表
     * @param page
     * @param rows
     * @return
     */
    EasyUIResult getProductParamList(Integer page, Integer rows);

    /**
     * 根据商品分类ID获取商品参数
     * @param cid
     * @return
     */
    WeLifeResult getProductParamByCid(Integer cid);

    /**
     * 添加商品参数
     * @param productParam
     * @return
     */
    WeLifeResult insertProductParam(WeProductParam productParam);
}
