package com.welife.controller;

import com.welife.service.ProductParamItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 *
 * @TODO 展示商品规格参数
 * @author Creeper
 * @Data 2017年6月26日下午2:18:54
 */

@Controller
public class ProductParamItemController {

	@Autowired
	private ProductParamItemService productParamItemService;

	@RequestMapping("/showProduct/{productId}")
	public String showItemParam(@PathVariable Long itemId, Model model){
		String string = productParamItemService.getProductParamByProductId(itemId);
		model.addAttribute("productParam", string);
		return "product";
	}

}
