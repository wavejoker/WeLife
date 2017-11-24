package com.welife.service;

import com.welife.common.pojo.EasyUIResult;
import com.welife.common.utils.WeLifeResult;
import com.welife.pojo.WeContent;

public interface ContentService {

    EasyUIResult getContentList(Long categoryId, Integer page, Integer rows);

    WeLifeResult insertContent(WeContent content);

    WeLifeResult updateContent(WeContent content);

    WeLifeResult deleteContent(Long[] ids);
}
