package com.welife.rest.controller;

import com.welife.common.utils.WeLifeResult;
import com.welife.rest.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 商品服务Controller
 * @author creeper
 * @date 下午6:16 17-11-11
 * @since 1.8.0_151
 */

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    /**
     * 根据商品ID获取商品基本信息
     * @param productId
     */
    @RequestMapping("/info/{productId}")
    @ResponseBody
    public WeLifeResult getProductBaseInfo(@PathVariable Long productId){
        WeLifeResult productBaseInfo = productService.getProductBaseInfo(productId);
        return WeLifeResult.ok(productBaseInfo);
    }

    /**
     * 根据商品ID获取商品描述
     * @param productId
     */
    @RequestMapping("/desc/{productId}")
    @ResponseBody
    public WeLifeResult getProductDesc(@PathVariable Long productId){
        WeLifeResult productDesc = productService.getProductDesc(productId);
        return WeLifeResult.ok(productDesc);
    }

    /**
     * 根据商品ID获取商品参数信息
     * @param productId
     */
    @RequestMapping("/param/{productId}")
    @ResponseBody
    public WeLifeResult getProductParam(@PathVariable Long productId){
        WeLifeResult productParam = productService.getProductParam(productId);
        return WeLifeResult.ok(productParam);
    }
}
