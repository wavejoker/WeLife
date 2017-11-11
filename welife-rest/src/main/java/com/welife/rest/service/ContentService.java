package com.welife.rest.service;

import com.welife.pojo.WeContent;

import java.util.List;

/**
 * 商品内容管理服务
 * @author Creeper
 * @date 17-11-9 下午7:07
 * @since 1.8.0_151
 */
public interface ContentService {

    /**
     * 获取内容列表
     * @param categroyId
     * @return
     */
    List<WeContent> getContentList(Long categroyId);

}
