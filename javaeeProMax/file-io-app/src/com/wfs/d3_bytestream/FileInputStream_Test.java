package com.wfs.d3_bytestream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * InputStream:字节输入流
 * 字节流适合数据的转移，如文件复制
 * 每次读取1个字节
 */
public class FileInputStream_Test {
    public static void main(String[] args) throws IOException {
        // 1 创建管道
        InputStream inputStream = new FileInputStream("file-io-app\\src\\wfs.txt");
        // 2 读数据
        int b1 = inputStream.read();// 当无数据时 会返回-1
        System.out.println((char)b1);
        // 3 循环读数据
        int data;
        while((data = inputStream.read())!=-1){
            System.out.print((char)data);// 乱码的原因是：汉字是3字节，被一个字节一个字节读肯定会乱码
        }
        // 4 关闭管道:使用完毕后一定要关闭！
        inputStream.close();
    }
}
