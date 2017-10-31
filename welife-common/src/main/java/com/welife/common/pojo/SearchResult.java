package com.welife.common.pojo;

import java.util.List;

public class SearchResult {

	// 商品列表
	private List<WeProduct> itemList;
	// 总记录数
	private Long recordCount;
	// 总页数
	private Long pageCount;
	// 当前页
	private Integer curPage;

	public List<WeProduct> getItemList() {
		return itemList;
	}

	public void setItemList(List<WeProduct> itemList) {
		this.itemList = itemList;
	}

	public Long getRecordCount() {
		return recordCount;
	}

	public void setRecordCount(Long recordCount) {
		this.recordCount = recordCount;
	}

	public Long getPageCount() {
		return pageCount;
	}

	public void setPageCount(Long pageCount) {
		this.pageCount = pageCount;
	}

	public Integer getCurPage() {
		return curPage;
	}

	public void setCurPage(Integer curPage) {
		this.curPage = curPage;
	}

}
