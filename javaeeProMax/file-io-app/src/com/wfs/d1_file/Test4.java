package com.wfs.d1_file;

import java.io.File;
import java.util.List;

/**
 * File遍历文件夹
 */
public class Test4 {
    public static void main(String[] args) {
        // 1 获取当前目录下所有的"一级文件名称"到一个字符串数组中去返回。
        File file = new File("D:\\github");
        String[] files = file.list();
        for (int i = 0; i < files.length; i++) {
            System.out.println(files[i]);
        }
        // 2 获取当前目录下所有的"一级文件对象"到一个文件对象数组中去返回（重点）
        File[] list = file.listFiles();
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}
