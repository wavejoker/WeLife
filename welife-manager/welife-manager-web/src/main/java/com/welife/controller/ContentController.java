package com.welife.controller;

import com.welife.common.pojo.EasyUIResult;
import com.welife.common.utils.WeLifeResult;
import com.welife.pojo.WeContent;
import com.welife.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * @TODO 内容管理Controller
 * @author Creeper
 * @Data 2017年7月17日下午6:20:20
 *
 */
@Controller
@RequestMapping("/content")
public class ContentController {
	
	@Autowired
	private ContentService contentService;
	
	@RequestMapping("/query/list")
	@ResponseBody
	public EasyUIResult getContentList(Long categoryId, Integer page, Integer rows){
		//TODO 获取内容列表
		EasyUIResult result = contentService.getContentList(categoryId, page, rows);
		return result;
	}
	
	@RequestMapping("/save")
	@ResponseBody
	public WeLifeResult addContent(WeContent content){
		WeLifeResult result = contentService.insertContent(content);
		return result;
	}
	
	@RequestMapping("/edit")
	@ResponseBody
	public WeLifeResult editContent(WeContent content){
		WeLifeResult result = contentService.updateContent(content);
		return result;
	}
	
	@RequestMapping("/delete")
	@ResponseBody
	public WeLifeResult deleteContent(Long[] ids){
		WeLifeResult result = contentService.deleteContent(ids);
		return result;
	}
}
