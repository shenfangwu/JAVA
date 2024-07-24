package com.wfs.d1_file;

import java.io.File;

/**
 * File
 */
public class Test {
    public static void main(String[] args) {
        // 1 创建File对象，指代一个具体的文件/目录
        // 路径分隔符
        // File f1 = new File("D:/github/JAVA/README.md");
        // File f1 = new File("D:\\github\\JAVA\\README.md");
        File f1 = new File("D:"+File.separator+"github"+File.separator+"JAVA"+File.separator+"README.md");
        System.out.println(f1.length());// 文件大小
        File f2 = new File("D:/github/JAVA/test.md");
        System.out.println(f2.length());// File对象可以指代一个不存在的文件路径
        System.out.println(f2.exists());// false
        // 绝对路径 相对路径
        File f4 = new File("file-io-app\\src\\Main.java");
        System.out.println(f4.length());
    }
}
