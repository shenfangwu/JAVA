package com.wfs.d9_api;

import java.util.Objects;

/**
 * 包装类：把基本数据类型的数据包装成引用类型
 * Byte、Short、Interger、Long、Character、Float、Double、Boolean
 */
public class Test2 {
    public static void main(String[] args) {
        // 1 自动装箱：基本数据类型可以自动转换为包装类型
        Integer num = Integer.valueOf(12);
        // 2 自动拆箱：包装类型可以转换为基本数据类型
        System.out.println(num);
        int myNum = num;
        System.out.println(myNum);
        // 3 包装类的其他常见操作
        // 3.1 基本类型转换字符串类型
        System.out.println(num.toString()+1);
        // 3.2 字符串类型转换成数值本身对应的数据类型
        String str = num.toString()+1;
        System.out.println(Integer.parseInt(str));
        System.out.println(Integer.valueOf(str));
    }
}
