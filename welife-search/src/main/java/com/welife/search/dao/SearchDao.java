package com.welife.search.dao;

import com.welife.common.pojo.SearchResult;
import org.apache.solr.client.solrj.SolrQuery;



public interface SearchDao {

    SearchResult search(SolrQuery query) throws Exception;
}
