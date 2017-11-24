package com.welife.service;

import java.util.List;

import com.welife.common.pojo.EUTreeNode;
import com.welife.common.utils.WeLifeResult;

public interface ContentCategoryService {

	List<EUTreeNode> getCategoryList(Long parentId);
	
	WeLifeResult insertContentCategory(Long parentId, String name);

	WeLifeResult deleteContentCategory(Long parentId, Long id);

	WeLifeResult updateContentCategory(Long id, String name);
	
}
