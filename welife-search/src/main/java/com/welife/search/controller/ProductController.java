package com.welife.search.controller;

import com.welife.common.utils.WeLifeResult;
import com.welife.search.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * 
 * @TODO 索引库维护
 * @author Creeper
 * @Data 2017年7月25日上午8:34:18
 *
 */
@Controller
@RequestMapping("/manager")
public class ProductController {

	@Autowired
	private ProductService productService;

	@RequestMapping("/importall")
	@ResponseBody
	public WeLifeResult importAllItems() {
		WeLifeResult result = productService.importAllProducts();
		return result;
	}

}
