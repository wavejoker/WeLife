package com.welife;

import org.apache.commons.net.ftp.FTPClient;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;

/**
 * @author Creeper
 * @date 17-11-1 上午10:18
 * @since 1.8.0_151
 */
public class FTPClientTest {

    @Test
    public void testFtp() throws Exception {
        //1、连接ftp服务器
        FTPClient ftpClient = new FTPClient();
        ftpClient.connect("192.168.19.129", 21);
        //2、登录ftp服务器
        boolean login = ftpClient.login("ftpuser", "ftproot");
        System.out.println(login);
        //3、读取本地文件
        FileInputStream inputStream = new FileInputStream(new File("/home/creeper/wallpaper/2310.jpg"));
        //4、上传文件
        //1）指定上传目录
        boolean b = ftpClient.changeWorkingDirectory("/home/ftpuser/www/images");
        System.out.println(b);
        //2）指定文件类型
        boolean b1 = ftpClient.setFileType(FTPClient.BINARY_FILE_TYPE);
        System.out.println(b1);
        //第一个参数：文件在远程服务器的名称
        //第二个参数：文件流
        boolean b2 = ftpClient.storeFile("hello.jpg", inputStream);
        System.out.println(b2);
        //5、退出登录
        ftpClient.logout();
    }
}