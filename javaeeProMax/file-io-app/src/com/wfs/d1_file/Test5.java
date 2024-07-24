package com.wfs.d1_file;

import java.io.File;

/**
 * 案例：D盘搜索qq.exe 找到后打印地址
 */
public class Test5 {
    public static void main(String[] args) {
        File dfile = new File("D:/");
        String qq = "QQ.exe";
        find(dfile, qq);
    }

    public static void find(File dir, String fileName) {
        // 1 非法拦截 输入为空 目录不存在 该目录是文件
        if (dir == null || !dir.exists() || dir.isFile()) {
            return;
        }
        // 2 file不是null且存在且不是文件，就是目录对象
        // 获取当前目录的一级文件对象
        File[] files = dir.listFiles();
        // 3 判断当前目录是否存在一级文件对象，一级是否可以拿到此对象
        if (files != null && files.length > 0) {
            // 4 遍历全部一级文件对象
            for (File file : files) {
                // 5 判断文件是否是文件还是文件夹
                if(file.isFile()){
                    // 是文件 判断文件名是否是我们找的
                    if(file.getName().contains(fileName)){
                        System.out.println(file.getAbsolutePath());
                    }
                }else {
                    // 是文件夹，则继续这个过程
                    find(file,fileName);
                }
            }
        }
    }
}
