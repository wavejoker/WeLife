package com.welife.controller;

import com.welife.common.pojo.EUTreeNode;
import com.welife.service.ProductCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author: Creeper
 * @DesCription:
 * @Date: 17-10-23 下午3:09
 * @Modified By:
 */
@Controller
@RequestMapping("/product/cat")
public class ProductCatController {

    @Autowired
    private ProductCatService productCatService;
    @RequestMapping(value = "list")
    @ResponseBody
    public List<EUTreeNode> getProductList(@RequestParam(value = "id", defaultValue = "0") Long parentId){
        List<EUTreeNode> treeNodes = productCatService.getCatList(parentId);
        return treeNodes;
    }
}
