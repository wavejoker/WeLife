package com.welife.controller;

import com.welife.common.utils.JsonUtils;
import com.welife.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

/**
 * @author Creeper
 * @date 17-10-24 下午7:03
 * @since 1.8.0_151
 */

@Controller
public class PictureController {
    @Autowired
    private PictureService pictureService;

    @RequestMapping("/pic/upload")
    @ResponseBody
    public String pictureUpload(MultipartFile uploadFile){
        Map result = pictureService.pictureUpload(uploadFile);
        //为了保证功能的兼容性,将结果转化为JSON
        String json = JsonUtils.objectToJson(result);
        return json;
    }
}