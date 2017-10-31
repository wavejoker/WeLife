package com.welife.service;

import org.springframework.web.multipart.MultipartFile;

import java.util.Map;


public interface PictureService {

    /**
     * 上传图片的服务
     * @param uploadFile
     * @return
     */
    Map pictureUpload(MultipartFile uploadFile);

}
