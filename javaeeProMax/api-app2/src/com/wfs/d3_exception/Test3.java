package com.wfs.d3_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 异常的两种处理方式
 * 1 捕获异常，记录异常并响应合适的信息给用户
 * 2 捕获异常，尝试重新修复
 */
public class Test3 {
    // 1 捕获异常，记录异常并响应合适的信息给用户
    public static void main(String[] args) {

        try {
            showTime();
        } catch (Exception e) {
            System.out.println("操作错误");
            throw new RuntimeException(e);
        }
    }
    public static void showTime()  throws Exception{
        String time = "2024-05-04 11:11:11";
        LocalDateTime localDateTime = LocalDateTime.parse(time, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(localDateTime);
        openImg();
    }
    public static void openImg() throws FileNotFoundException {
        InputStream inputStream = new FileInputStream("E:/");
    }
}
