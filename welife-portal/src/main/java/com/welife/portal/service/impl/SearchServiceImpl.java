package com.welife.portal.service.impl;

import java.util.HashMap;
import java.util.Map;

import com.welife.common.pojo.SearchResult;
import com.welife.common.utils.HttpClientUtil;
import com.welife.common.utils.WeLifeResult;
import com.welife.portal.service.SearchService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


/**
 * 调用搜索服务Service实现类
 * 
 * @TODO
 * @author Creeper
 * @Data 2017年7月27日下午3:14:54
 *
 */

@Service
public class SearchServiceImpl implements SearchService {

	@Value("${SEARCH_BASE_URL}")
	private String SEARCH_BASE_URL;

	@Override
	public SearchResult search(String queryString, Integer pages) {
		// 调用taotao-search服务
		// 查询参数
		Map<String, String> param = new HashMap<>();
		param.put("q", queryString);
		param.put("page", pages + "");
		try {
			// 调用服务
			String json = HttpClientUtil.doGet(SEARCH_BASE_URL, param);
			// 把字符串转换成Java对象
			WeLifeResult weLifeResult = WeLifeResult.formatToPojo(json, SearchResult.class);
			if (weLifeResult.getStatus() == 200) {
				SearchResult result = (SearchResult) weLifeResult.getData();
				return result;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
