package com.welife.service.impl;

import com.welife.common.utils.FtpUtil;
import com.welife.common.utils.IDUtils;
import com.welife.service.PictureService;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Creeper
 * @date 17-10-22 下午10:23
 */

@Service
public class PictureServiceImpl implements PictureService {

    @Value("${FTP_ADDRESS}")
    private String FTP_ADDRESS;
    @Value("${FTP_PORT}")
    private Integer FTP_PORT;
    @Value("${FTP_USERNAME}")
    private String FTP_USERNAME;
    @Value("${FTP_PASSWORD}")
    private String FTP_PASSWORD;
    @Value("${FTP_BASE_PATH}")
    private String FTP_BASE_PATH;
    @Value("${IMAGE_BASE_URL}")
    private String IMAGE_BASE_URL;


    @Override
    public Map pictureUpload(MultipartFile uploadFile) {
        Map resultMap = new HashMap();
        try {
            //生成一个新的文件名
            //取原始的文件名
            String oldName = uploadFile.getOriginalFilename();
            //生成新的文件名
            String imagePath = new DateTime().toString("/yyyy/MM/dd");
            String newName = IDUtils.genImageName();
            newName = newName + oldName.substring(oldName.lastIndexOf("."));
            //开始上传
            boolean result = FtpUtil.uploadFile(FTP_ADDRESS, FTP_PORT, FTP_USERNAME, FTP_PASSWORD, FTP_BASE_PATH, imagePath, newName, uploadFile.getInputStream());
            if (!result) {
                resultMap.put("error", 1);
                resultMap.put("message", "文件上传失败");
                return resultMap;
            } else {
                resultMap.put("error", 0);
                resultMap.put("url", IMAGE_BASE_URL + imagePath + "/" + newName);
                return resultMap;
            }
        } catch (Exception e) {
            resultMap.put("error", 1);
            resultMap.put("message", "文件上传异常");
            return resultMap;
        }
    }
}
