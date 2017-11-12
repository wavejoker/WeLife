package com.welife.portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.portal.pojo.ItemInfo;
import com.taotao.portal.service.ItemService;

/**
 * 商品管理Controller
 * 
 * @TODO
 * @author Creeper
 * @Data 2017年7月28日 下午6:57:37
 *
 */
@Controller
public class ItemController {

	@Autowired
	private ItemService itemService;

	@RequestMapping("/item/{itemId}")
	public String showItem(@PathVariable Long itemId, Model model) {
		ItemInfo itemInfo = itemService.getItemById(itemId);
		model.addAttribute("item", itemInfo);
		return "item";
	}

	@RequestMapping(value="/item/desc/{itemId}", produces=MediaType.TEXT_HTML_VALUE+";charset=utf-8;")
	@ResponseBody
	public String getItemDesc(@PathVariable Long itemId) {
		String itemDesc = itemService.getItemDesc(itemId);
		return itemDesc;
	}
	
	/**
	  * @Exception 点击商品对个参数Tab页面时商品描述会消失
	  */
	@RequestMapping(value="/item/param/{itemId}", produces=MediaType.TEXT_HTML_VALUE+";charset=utf-8;")
	@ResponseBody
	public String getItemParam(@PathVariable Long itemId) {
		String itemParam = itemService.getItemParam(itemId);
		return itemParam;
	}
	
}
