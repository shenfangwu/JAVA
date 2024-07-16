package com.wfs.d4_block;

public class Student {
    static int number;
    static String schoolName;
    // 静态代码块
    static {
        System.out.println("静态代码块执行了");
    }
    public  Student(){
        System.out.println("这是无参构造器！");
    }
    // 实例代码块
    {
        System.out.println("实例代码块执行了");
    }

}
