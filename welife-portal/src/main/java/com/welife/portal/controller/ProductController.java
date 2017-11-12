package com.welife.portal.controller;

import com.welife.portal.pojo.ProductInfo;
import com.welife.portal.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * 商品管理Controller
 * 
 * @TODO
 * @author Creeper
 * @Data 2017年7月28日 下午6:57:37
 *
 */
@Controller
public class ProductController {

	@Autowired
	private ProductService productService;

	@RequestMapping("/product/{productId}")
	public String showItem(@PathVariable Long productId, Model model) {
		ProductInfo productInfo = productService.getProductById(productId);
		model.addAttribute("item", productId);
		return "item";
	}

	@RequestMapping(value="/product/desc/{productId}", produces=MediaType.TEXT_HTML_VALUE+";charset=utf-8;")
	@ResponseBody
	public String getItemDesc(@PathVariable Long productId) {
		String productDesc = productService.getProductDesc(productId);
		return productDesc;
	}
	
	/**
	  * @Exception 点击商品对个参数Tab页面时商品描述会消失
	  */
	@RequestMapping(value="/product/param/{productId}", produces=MediaType.TEXT_HTML_VALUE+";charset=utf-8;")
	@ResponseBody
	public String getItemParam(@PathVariable Long productId) {
		String productParam = productService.getProductParam(productId);
		return productParam;
	}
	
}
