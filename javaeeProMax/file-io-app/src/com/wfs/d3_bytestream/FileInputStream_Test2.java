package com.wfs.d3_bytestream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * InputStream 字节输入流
 * 每次读多个字节
 */
public class FileInputStream_Test2 {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("file-io-app\\src\\wfs.txt");
        // 创建缓冲区
        byte[] buffer = new byte[10];
        // 第一次读取
        int len = is.read(buffer);
        String rs = new String(buffer,0,len);// 读取多少，倒多少
        System.out.println(rs);
        System.out.println("当前读取的字数是："+ len);
        // 第二次读取
        int len2 = is.read(buffer);
        String rs2 = new String(buffer,0,len2);
        System.out.println(rs2);
        System.out.println("当前读取的字数是："+ len2);
        // 第三次读取
        int len3 = is.read(buffer);
        String rs3 = new String(buffer,0,len3);
        System.out.println(rs3);
        System.out.println("当前读取的字数是："+ len3);
        // 第四次读取
        int len4 = is.read(buffer);
        System.out.println(len4);// -1

        is.close();
    }
}
