package com.welife;

import org.apache.commons.net.ftp.FTPClient;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;

/**
 * @author : Creeper
 * @deprecated  :
 * @date : 17-10-24 下午5:25
 */
public class FtpClientTest {

    @Test
    public void testFtp() throws Exception {
        //1、连接ftp服务器
        FTPClient ftpClient = new FTPClient();
        ftpClient.connect("192.168.1.102", 21);
        //2、登录ftp服务器
        ftpClient.login("ftpuser", "ftproot");
        //3、读取本地文件
        FileInputStream inputStream = new FileInputStream(new File("/home/creeper/wallpaper/drinking_coffee_while_reading-wallpaper-1366x768.jpg"));
        //4、上传文件
        //1）指定上传目录
        ftpClient.changeWorkingDirectory("/home/ftpuser/www/images");
        //2）指定文件类型
        ftpClient.setFileType(FTPClient.BINARY_FILE_TYPE);
        //第一个参数：文件在远程服务器的名称
        //第二个参数：文件流
        ftpClient.storeFile("hello.jpg", inputStream);
        //5、退出登录
        ftpClient.logout();
    }


}

