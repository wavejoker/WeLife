package com.welife.rest.controller;

import com.welife.rest.pojo.CatResult;
import com.welife.rest.service.ProductCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 商品分类服务Controller
 * @author Creeper
 * @date 17-11-10 下午7:40
 * @since 1.8.0_151
 */
@Controller
public class ProductCatController {

    @Autowired
    private ProductCatService productCatService;

    @RequestMapping(value = "/productCat/all")
    @ResponseBody
    public Object getProductCatList(String callback){
        CatResult catResult = productCatService.getProductItemList();
        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(catResult);
        mappingJacksonValue.setJsonpFunction(callback);
        return mappingJacksonValue;
    }
}
