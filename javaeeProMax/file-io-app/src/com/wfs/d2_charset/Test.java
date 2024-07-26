package com.wfs.d2_charset;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * 字符集
 */
public class Test {
    public static void main(String[] args) throws UnsupportedEncodingException {
        // 编码
        // 1 默认
        String data = "w方s";
        byte[] bytes = data.getBytes();// 用平台默认的字符集进行编码 汉字3字节 数字、字符 1字节
        System.out.println(Arrays.toString(bytes));
        // 2 按照指定字符集进行编码
        byte[] bytes1 = data.getBytes("GBK");// 汉字2字节 数字、字符 1字节
        System.out.println(Arrays.toString(bytes1));

        // 解码
        // 3 默认解码
        String s1 = new String(bytes);
        System.out.println(s1);
        // 4 按照指定字符集解码
        String s2 = new String(bytes1,"GBK");
        System.out.println(s2);
    }
}
