package com.welife.controller;

import com.welife.common.utils.WeLifeResult;
import com.welife.service.ProductParamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 商品参数Controller
 *
 * @author Creeper
 * @date 17-10-27 下午3:35
 * @since 1.8.0_151
 */
@Controller
@RequestMapping("/product/param")
public class ProductParamController {

    @Autowired
    private ProductParamService paramService;
    @RequestMapping("/query/productCid/{productCid}")
    @ResponseBody
    public WeLifeResult getProductParamByCid(@PathVariable Long productCid) {
        WeLifeResult productParams = paramService.getProductParamByCid(productCid);
        return productParams;
    }


}
