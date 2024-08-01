package com.wfs.d1_Properties;

import java.io.*;
import java.util.Properties;
import java.util.Set;

/**
 * Properties
 * 是一个Map集合（键值对集合），但是我们一般不会当集合使用。
 * 核心作用：Properties是用来代表属性文件的，通过Properties可以读写属性文件里的内容
 */
public class PropertiesTest1 {
    public static void main(String[] args) throws Exception {
        Properties pp = new Properties();
        // 1 读取Properties文件的数据
        pp.load(new FileReader("properties-xml-log-app/src/user.txt"));// 读取属性文件里的键值对数据
        Set<String> stringSet = pp.stringPropertyNames();// 获取全部键的集合
        stringSet.forEach((k)->{
            System.out.print(k+"==>");
            System.out.println(pp.getProperty(k));// 根据键获取值
        } );
        // 2 写入Properties文件的数据
        if(pp.containsKey("wfs")){// 判断有没有指定KEY
            pp.setProperty("wfs","321");// 设置key对应值
        }
        // 3 把键值对数据，通过字符输出流写出到属性文件里去
        pp.store(new FileWriter("properties-xml-log-app/src/user2.txt"),"写入数据");
    }
}
