package com.welife.search.controller;

import com.welife.common.pojo.SearchResult;
import com.welife.common.utils.ExceptionUtil;
import com.welife.common.utils.WeLifeResult;
import com.welife.search.service.SearchService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 商品查询服务Controller
 * 
 * @author Creeper
 * @Data 2017年7月25日下午6:01:12
 *
 */
@Controller
public class SearchController {

	@Autowired
	private SearchService searchService;

	@RequestMapping(value = "/query", method = RequestMethod.GET)
	@ResponseBody
	public WeLifeResult search(@RequestParam("q") String queryString, @RequestParam(defaultValue = "1") Integer page,
							   @RequestParam(defaultValue = "60") Integer rows) {
		// TODO 搜索条件为空时可以默认搜索推荐的搜索条件(广告条目)
		// 判断查询条件是否为空,如果为空,则提示
		if (StringUtils.isBlank(queryString)) {
			return WeLifeResult.build(400, "搜索条件不能为空");
		}
		SearchResult searchResult = null;
		try {
			//解决get请求乱码,可以在前台页面通过JS解决
			queryString = new String(queryString.getBytes("iso8859-1"),"utf-8");
			searchResult = searchService.search(queryString, page, rows);
		} catch (Exception e) {
			e.printStackTrace();
			return WeLifeResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		return WeLifeResult.ok(searchResult);
	}

}
