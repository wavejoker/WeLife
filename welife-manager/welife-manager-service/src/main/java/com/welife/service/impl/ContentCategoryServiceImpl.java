package com.welife.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.welife.common.pojo.EUTreeNode;
import com.welife.common.utils.WeLifeResult;
import com.welife.mapper.WeContentCategoryMapper;
import com.welife.pojo.WeContentCategory;
import com.welife.pojo.WeContentCategoryExample;
import com.welife.service.ContentCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 内容分类管理
 * 
 * @author Creeper
 * @Data 2017年6月30日下午6:09:17
 *
 */

@Service
public class ContentCategoryServiceImpl implements ContentCategoryService {

	@Autowired
	private WeContentCategoryMapper contentCategoryMapper;

	@Override
	public List<EUTreeNode> getCategoryList(Long parentId) {
		// TODO 获取内容分类列表
		// 根据parentId查询节点列表
		WeContentCategoryExample example = new WeContentCategoryExample();
		WeContentCategoryExample.Criteria criteria = example.createCriteria();
		criteria.andParentIdEqualTo(parentId);
		// 执行查询
		List<WeContentCategory> list = contentCategoryMapper.selectByExample(example);
		List<EUTreeNode> resultList = new ArrayList<>();
		for (WeContentCategory tbContentCategory : list) {
			// 创建一个节点
			EUTreeNode node = new EUTreeNode();
			node.setParentId(tbContentCategory.getParentId());
			node.setId(tbContentCategory.getId());
			node.setText(tbContentCategory.getName());
			node.setState(tbContentCategory.getIsParent() ? "closed" : "open");
			resultList.add(node);
		}
		return resultList;
	}

	@Override
	public WeLifeResult insertContentCategory(Long parentId, String name) {
		// TODO 添加内容分类节点
		//创建一个pojo
		WeContentCategory contentCategory = new WeContentCategory();
		contentCategory.setName(name);
		contentCategory.setIsParent(false);
		//Status状态为可选值,1为正常,2为删除
		contentCategory.setStatus(1);
		contentCategory.setParentId(parentId);
		contentCategory.setSortOrder(1);
		contentCategory.setCreated(new Date());
		contentCategory.setUpdated(new Date());
		//添加记录
		contentCategoryMapper.insert(contentCategory);
		//查看父节点的isParent()是否为true,如果不为true则改为true
		WeContentCategory parentCat = contentCategoryMapper.selectByPrimaryKey(parentId);
		if (!parentCat.getIsParent()) {
			parentCat.setIsParent(true);
			//更新父节点
			contentCategoryMapper.updateByPrimaryKey(parentCat);
		}
		//返回结果
		return WeLifeResult.ok(contentCategory);
	}

	@Override
	public WeLifeResult deleteContentCategory(Long parentId, Long id) {
		// TODO 删除内容分类节点
		WeContentCategory category = contentCategoryMapper.selectByPrimaryKey(id);
		if(!category.getIsParent()){
			contentCategoryMapper.deleteByPrimaryKey(id);
		}else {
			contentCategoryMapper.deleteByPrimaryKey(id);
			WeContentCategoryExample example = new WeContentCategoryExample();
			WeContentCategoryExample.Criteria criteria = example.createCriteria();
			criteria.andParentIdEqualTo(id);
			List<WeContentCategory> list = contentCategoryMapper.selectByExample(example);
			if(!(list.size() == 0) || !(list == null)){
				for (WeContentCategory category2 : list) {
					deleteContentCategory(category2.getParentId(), category2.getId());
				}
			}
			contentCategoryMapper.deleteByExample(example);
		}
		updateParent(id);
		return WeLifeResult.ok(category);
	}
	
	private void updateParent(Long parentId){
		//TODO 如果该节点的父节点下没有兄弟节点,则将父节点的isParent属性设为0
		WeContentCategoryExample example = new WeContentCategoryExample();
		WeContentCategoryExample.Criteria createCriteria = example.createCriteria();
		createCriteria.andParentIdEqualTo(parentId);
		List<WeContentCategory> list = contentCategoryMapper.selectByExample(example);
		if(list.size() == 0 || list == null){
			for (WeContentCategory tbContentCategory : list) {
				contentCategoryMapper.updateIsParentById(tbContentCategory.getId());
			}
			contentCategoryMapper.updateIsParentById(parentId);
		}
	}

	@Override
	public WeLifeResult updateContentCategory(Long id, String name) {
		// TODO 重命名内容分类节点
		WeContentCategory category = new WeContentCategory();
		category.setId(id);
		category.setName(name);
		contentCategoryMapper.updateNameById(category);
		return WeLifeResult.ok();
	}
}
