package com.wfs.d3_final;

/**
 * 学习常量:使用static final修饰的成员变量
 */
public class Test2 {
    // 1 常量用于记录系统的配置信息
    // 2 代码可读性好，可维护性好
    // 3 程序编译后，常量会被‘宏替换‘：出现常量的地方全部会被替换成其记录的字面量
    public static final String SCHOOL_NAME = "hangdanyuan";
    public static void main(String[] args) {
        System.out.println(SCHOOL_NAME);
        System.out.println(SCHOOL_NAME);
        System.out.println(SCHOOL_NAME);
        System.out.println(SCHOOL_NAME);
        System.out.println(SCHOOL_NAME);
    }
}
