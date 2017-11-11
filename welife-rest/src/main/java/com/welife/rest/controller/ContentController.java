package com.welife.rest.controller;

import com.welife.common.utils.ExceptionUtil;
import com.welife.common.utils.WeLifeResult;
import com.welife.pojo.WeContent;
import com.welife.rest.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 商品内容服务Controller
 *
 * @author Creeper
 * @date 17-11-10 下午7:46
 * @since 1.8.0_151
 */
@Controller
@RequestMapping(value = "/content")
public class ContentController {

    @Autowired
    private ContentService contentService;

    @RequestMapping(value = "/list/{contentCategoryId}")
    @ResponseBody
    public WeLifeResult getContentList(@PathVariable Long contentCategoryId) {
        try {
            List<WeContent> contentList = contentService.getContentList(contentCategoryId);
            return WeLifeResult.ok(contentList);
        } catch (Exception e) {
            e.printStackTrace();
            return WeLifeResult.build(500, ExceptionUtil.getStackTrace(e));
        }
    }
}
