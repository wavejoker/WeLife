package com.welife.controller;

import com.welife.common.pojo.EasyUIResult;
import com.welife.common.utils.WeLifeResult;
import com.welife.pojo.WeProduct;
import com.welife.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Creeper
 * @date  17-10-23 上午8:56
 */

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    /**
     * 显示商品列表
     * @param page
     * @param rows
     * @return
     */
    @RequestMapping("/product/list")
    @ResponseBody
    public EasyUIResult getProductList(Integer page, Integer rows){
        EasyUIResult productList = productService.getProductList(page, rows);
        return productList;
    }

    /**
     * 新增商品
     * @param product
     * @param desc
     * @return
     * @throws Exception
     */
    @RequestMapping("/product/save")
    @ResponseBody
    public WeLifeResult createProduct(WeProduct product, String desc) throws Exception {
        WeLifeResult result = productService.creatProduct(product, desc);
        return result;
    }

}
