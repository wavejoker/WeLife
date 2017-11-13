package com.welife.search.service;


import com.welife.common.pojo.SearchResult;

/**
 * 商品搜索Service
 * @author Creeper
 * @Data 2017年7月25日下午4:51:59
 *
 */
public interface SearchService {
	
	SearchResult search(String queryString, Integer pages, Integer rows) throws Exception;
}
