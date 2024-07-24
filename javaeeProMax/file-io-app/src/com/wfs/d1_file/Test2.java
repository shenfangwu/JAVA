package com.wfs.d1_file;

import java.io.File;
import java.time.LocalDate;

/**
 * File常用方法：判断文件类型、获取文件信息功能
 */
public class Test2 {
    public static void main(String[] args) {
        File file = new File("D:\\github\\JAVA\\README.md");
        // 1 判断当前对象，对应文件路径是否存在
        System.out.println(file.exists());
        // 2 判断当前文件对象指代的是否是文件，是文件返回true，反之
        System.out.println(file.isFile());
        // 3 判断当前文件对象指代的是否是文件夹，是文件夹返回true，反之
        System.out.println(file.isDirectory());
        // 4 获取文件的名称（包含后缀）
        System.out.println(file.getName());
        //获取文件的大小，返回字节个数
        System.out.println(file.length());
        //获取文件的最后修改时间。
        long time = file.lastModified();
        System.out.println(file.lastModified());
        //获取创建文件对象时，使用的路径
        File f4 = new File("file-io-app\\src\\Main.java");
        System.out.println(f4.getPath());
        //获取绝对路径
        System.out.println(f4.getAbsoluteFile());
    }
}
