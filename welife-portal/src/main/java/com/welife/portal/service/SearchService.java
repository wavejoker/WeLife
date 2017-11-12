package com.welife.portal.service;


import com.welife.common.pojo.SearchResult;

public interface SearchService {

	SearchResult search(String queryString, Integer pages);
}
