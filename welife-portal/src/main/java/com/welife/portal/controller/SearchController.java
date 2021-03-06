package com.welife.portal.controller;

import java.io.UnsupportedEncodingException;

import com.welife.common.pojo.SearchResult;
import com.welife.portal.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * 搜索商品Controller
 *
 * @author Creeper
 * @Data 2017年7月27日下午3:58:07
 *
 */
@Controller
public class SearchController {

	@Autowired
	private SearchService searchService;

	@RequestMapping("/search")
	public String search(@RequestParam("q") String queryString, @RequestParam(defaultValue="1")Integer page, Model model) {
		if (queryString != null) {
			try {
				queryString = new String(queryString.getBytes("iso8859-1"), "utf8");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		}
		SearchResult searchResult = searchService.search(queryString, page);
		model.addAttribute("query", queryString);
		model.addAttribute("totalPages", searchResult.getPageCount());
		model.addAttribute("itemList", searchResult.getProductList());
		model.addAttribute("page", page);
		return "search";
	}

}
