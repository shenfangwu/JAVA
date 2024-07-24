package com.wfs.d1_file;

import java.io.File;
import java.io.IOException;

/**
 * File方法：创建、删除
 */
public class Test3 {
    public static void main(String[] args) throws IOException {
        // 1 创建一个新的空的文件
        File file = new File("D:\\github\\JAVA\\test.md");
        System.out.println(file.createNewFile());
        // 2 只能创建一级文件夹
        File file1 = new File("D:\\github\\TEST");
        System.out.println(file1.mkdir());
        // 3 可以创建多级文件夹
        File file2 = new File("D:\\github\\TEST\\test\\test.txt");
        System.out.println(file2.mkdirs());
        // 4 删除文件、空文件夹,删除的文件不进入回收站
        System.out.println(file.delete());
        System.out.println(file2.delete());
    }
}
