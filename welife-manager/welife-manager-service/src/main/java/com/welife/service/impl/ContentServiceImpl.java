package com.welife.service.impl;

import java.util.Date;
import java.util.List;

import com.welife.common.pojo.EasyUIResult;
import com.welife.common.utils.HttpClientUtil;
import com.welife.common.utils.WeLifeResult;
import com.welife.mapper.WeContentMapper;
import com.welife.pojo.WeContent;
import com.welife.pojo.WeContentExample;
import com.welife.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class ContentServiceImpl implements ContentService {

	@Autowired
	private WeContentMapper contentMapper;

	@Value("${REST_BASE_URL}")
	private String REST_BASE_URL;
	@Value("${REST_CONTENT_SYNC_URL}")
	private String REST_CONTENT_SYNC_URL;

	@Override
	public EasyUIResult getContentList(Long categoryId, Integer page, Integer rows) {
		WeContentExample example = new WeContentExample();
		WeContentExample.Criteria criteria = example.createCriteria();
		criteria.andCategoryIdEqualTo(categoryId);
		// TODO 根据category_id查询内容列表
		List<WeContent> list = contentMapper.selectByExampleWithBLOBs(example);
		// 分页处理
		PageHelper.startPage(page, rows);
		// 取分页信息
		PageInfo<WeContent> info = new PageInfo<>(list);
		EasyUIResult result = new EasyUIResult(info.getTotal(), list);
		return result;
	}

	@Override
	public WeLifeResult insertContent(WeContent content) {
		// TODO 添加内容
		// 补全pojo
		content.setUpdated(new Date());
		content.setCreated(new Date());
		contentMapper.insert(content);
		try {
			HttpClientUtil.doGet(REST_BASE_URL + REST_CONTENT_SYNC_URL + content.getCategoryId());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return WeLifeResult.ok();
	}

	@Override
	public WeLifeResult updateContent(WeContent content) {
		// TODO 编辑内容
		contentMapper.updateByPrimaryKey(content);
		try {
			HttpClientUtil.doGet(REST_BASE_URL + REST_CONTENT_SYNC_URL + content.getCategoryId());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return WeLifeResult.ok();
	}

	@Override
	public WeLifeResult deleteContent(Long[] ids) {
		// TODO 删除内容
		//获取被删除项的CategrayId
		Long categrayId = getCategrayIdById(ids);
		for (Long long1 : ids) {
			contentMapper.deleteByPrimaryKey(long1);
		}
		try {
			HttpClientUtil.doGet(REST_BASE_URL + REST_CONTENT_SYNC_URL + categrayId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return WeLifeResult.ok();
	}

	private Long getCategrayIdById(Long[] ids) {
		WeContent content = contentMapper.selectByPrimaryKey(ids[0]);
		Long categoryId = content.getCategoryId();
		return categoryId;
	}
	

}
