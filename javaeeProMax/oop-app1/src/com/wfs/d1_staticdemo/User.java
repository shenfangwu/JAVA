package com.wfs.d1_staticdemo;

/**
 * 系统启动后，要求用户类记住自己创建多少个用户对象
 */
public class User {
    public static int number;
    public User(){// 访问自己类中的变量，可以省略类名不写
        number++;
    }
}
