package com.welife.service;

import com.welife.common.pojo.EasyUIResult;
import com.welife.common.utils.WeLifeResult;
import com.welife.pojo.WeContent;

public interface ContentService {

	public EasyUIResult getContentList(Long categoryId, Integer page, Integer rows);
	
	public WeLifeResult insertContent(WeContent content);
	
	public WeLifeResult updateContent(WeContent content);
	
	public WeLifeResult deleteContent(Long[] ids);
}
