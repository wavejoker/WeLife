package com.welife.controller;

import java.util.List;

import com.welife.common.pojo.EUTreeNode;
import com.welife.common.utils.WeLifeResult;
import com.welife.service.ContentCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * 
 * @TODO 内容分类管理
 * @author Creeper
 * @Data 2017年6月30日下午6:20:57
 * 
 */

@Controller
@RequestMapping("/content/category")
public class ContentCategoryController {

	@Autowired
	private ContentCategoryService contentCategoryService;

	@RequestMapping("/list")
	@ResponseBody
	public List<EUTreeNode> getContentCatList(@RequestParam(value = "id", defaultValue = "0") Long parentId) {
		List<EUTreeNode> list = contentCategoryService.getCategoryList(parentId);
		return list;
	}

	@RequestMapping("/create")
	@ResponseBody
	public WeLifeResult createContentCategroy(Long parentId, String name) {
		WeLifeResult result = contentCategoryService.insertContentCategory(parentId, name);
		return result;
	}
	
	@RequestMapping("/delete")
	@ResponseBody
	public WeLifeResult deleteContentCategroy(Long parentId, Long id){
		WeLifeResult result = contentCategoryService.deleteContentCategory(parentId, id);
		return result;
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public WeLifeResult updateContentCategroy(Long id, String name){
		WeLifeResult result = contentCategoryService.updateContentCategory(id, name);
		return result;
	}
	
	
}
