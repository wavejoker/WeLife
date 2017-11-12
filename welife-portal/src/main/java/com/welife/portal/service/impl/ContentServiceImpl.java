package com.welife.portal.service.impl;

import com.welife.common.utils.HttpClientUtil;
import com.welife.common.utils.JsonUtils;
import com.welife.common.utils.WeLifeResult;
import com.welife.pojo.WeContent;
import com.welife.portal.service.ContentService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



/**
 * 
 * @TODO 调用服务层服务,查询内容列表
 * @author Creeper
 * @Data 2017年7月18日下午10:59:19
 *
 */
@Service
public class ContentServiceImpl implements ContentService {

	@Value("${REST_BASE_URL}")
	private String REST_BASE_URL;
	@Value("${REST_INDEX_AD_URL}")
	private String REST_INDEX_AD_URL;

	@Override
	public String getContentList() {
		// 调用服务层服务
		String result = HttpClientUtil.doGet(REST_BASE_URL + REST_INDEX_AD_URL);
		// 把字符串转换成TaotaoResult
		try {
			WeLifeResult result1 = WeLifeResult.formatToList(result, WeContent.class);
			// 取内容列表
			@SuppressWarnings("unchecked")
			List<WeContent> list = (List<WeContent>) result1.getData();

			List<Map<String, Object>> resultList = new ArrayList<>();
			// 创建一个符合JSP页面的POJO列表
			for (WeContent weContent : list) {
				Map<String, Object> map = new HashMap<>();
				map.put("src", weContent.getPic());
				map.put("height", 240);
				map.put("width", 670);
				map.put("srcB", weContent.getPic2());
				map.put("heightB", 240);
				map.put("widthB", 550);
				map.put("href", weContent.getUrl());
				map.put("alt", weContent.getSubTitle());
				resultList.add(map);
			}
			return JsonUtils.objectToJson(resultList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
