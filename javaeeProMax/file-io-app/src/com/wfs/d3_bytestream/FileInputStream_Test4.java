package com.wfs.d3_bytestream;

import java.io.*;

/**
 * 解决InputStream中文乱码
 */
public class FileInputStream_Test4 {
    public static void main(String[] args) throws IOException {
        // 1 方法一：把文件数据全部读入一个字节数组
        // 缺陷：文件过大，可能出现内存溢出问题
        InputStream is = new FileInputStream("file-io-app\\src\\wfs.txt");
        File f = new File("file-io-app\\src\\wfs.txt");
        long len = f.length();// 文件大小用long接收，定义数组大小用int
        byte[] buffer = new byte[(int) len];
        int len1 = is.read(buffer);
        String str = new String(buffer,0,len1);
        System.out.println(str);
        System.out.println(len1);
        is.close();
        // 2 方法二：使用InputStream的readAllBytes方法
        InputStream is2 = new FileInputStream("file-io-app\\src\\wfs.txt");
        byte[] buffer2 = is2.readAllBytes();
        System.out.println(new String(buffer2));
        // 读写文本内容更适合字符流！！！！！！！！！！
    }
}
