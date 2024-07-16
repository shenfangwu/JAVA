package com.wfs.operator;

/**
 * 关系运算符
 */
public class OperatorDemo4 {
    public static void main(String[] args) {
        // 关系运算符： > >= < <= == !=
        // 判断数据是否满足条件 返回Boolen类型值
        int a = 10;
        int b = 5;
        boolean rs = a > b;
        System.out.println(rs);

        System.out.println(a>b);
        System.out.println(a>=b);
        System.out.println(a<b);
        System.out.println(a<=b);
        System.out.println(a==b);
        System.out.println(a!=b);
    }
}
