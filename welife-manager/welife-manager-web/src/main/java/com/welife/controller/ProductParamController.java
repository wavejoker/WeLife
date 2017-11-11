package com.welife.controller;

import com.welife.common.pojo.EasyUIResult;
import com.welife.common.utils.WeLifeResult;
import com.welife.pojo.WeProductParam;
import com.welife.service.ProductParamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
    private ProductParamService productParamService;

    @RequestMapping("/query/productCid/{productCid}")
    @ResponseBody
    public WeLifeResult getProductParamByCid(@PathVariable Long productCid) {
        WeLifeResult productParams = productParamService.getProductParamByCid(productCid);
        return productParams;
    }


    @RequestMapping(value = "/save/{cid}", method = RequestMethod.POST)
    @ResponseBody
    public WeLifeResult insertItemParam(@PathVariable Long cid, String paramData) {
        //创建pojo对象
        WeProductParam productParam = new WeProductParam();
        productParam.setProductCatId(cid);
        productParam.setParamData(paramData);
        WeLifeResult result = productParamService.insertProductParam(productParam);
        return result;
    }

    // 列出商品规格
    @RequestMapping("/list")
    @ResponseBody
    private EasyUIResult getItemParamList(@RequestParam(defaultValue = "20") Integer page, @RequestParam(defaultValue = "1") Integer rows) throws Exception {
        // 查询列表
        EasyUIResult result = productParamService.getProductParamList(page, rows);
        return result;
    }

}
