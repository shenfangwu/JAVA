package com.wfs.parameter;
// 基本类型的参数传递方式
// 传递的是数据值 是值传递
public class MethodDemo1 {
    public static void main(String[] args) {
        int a = 10;
        change(a);//1 传输的是实参存储的值的副本
    }
    public static void  change(int a){// 这个就是形参
        System.out.println(a);// 10
        a = 20;
        System.out.println(a);// 20
    }
}
