package com.welife.search.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.welife.common.pojo.Product;
import com.welife.common.pojo.SearchResult;
import com.welife.search.dao.SearchDao;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * 
 * @TODO 商品搜索Dao
 * @author Creeper
 * @Data 2017年7月25日上午9:48:44
 *
 */
@Repository
public class SearchDaoImpl implements SearchDao {

	@Autowired
	private SolrServer solrServer;

	@Override
	public SearchResult search(SolrQuery query) throws Exception {
		// 返回值对象
		SearchResult result = new SearchResult();
		// 根据查询条件查询索引库
		QueryResponse queryResponse = solrServer.query(query);
		// 取查询结果
		SolrDocumentList solrDocumentList = queryResponse.getResults();
		// 取查询结果总数量
		result.setRecordCount(solrDocumentList.getNumFound());
		// 商品列表
		List<Product> itemList = new ArrayList<>();
		// 取高亮显示
		Map<String, Map<String, List<String>>> highlighting = queryResponse.getHighlighting();
		// 取商品列表
		for (SolrDocument solrDocument : solrDocumentList) {
			// 创建一商品对象
			Product product = new Product();
			product.setCategory_name((String) solrDocument.get("product_category_name"));
			product.setId((String) solrDocument.get("id"));
			product.setImg((String) solrDocument.get("product_img"));
			product.setPrice((Long) solrDocument.get("product_price"));
			product.setSell_point((String) solrDocument.get("product_sell_point"));
			String title = "";
			// 取高亮显示的结果
			List<String> list = highlighting.get(solrDocument.get("id")).get("product_title");
			if (list != null && list.size() > 0) {
				title = list.get(0);
			} else {
				title = (String) solrDocument.get("product_title");
			}
			product.setTitle(title);
			// 添加的商品列表
			itemList.add(product);
		}
		// 将商品列表提交到返回结果中
		result.setProductList(itemList);
		return result;
	}

}
