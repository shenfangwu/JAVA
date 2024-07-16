package com.wfs.operator;

/**
 * 赋值运算符
 */
public class OperatorDemo3 {
    public static void main(String[] args) {
        // 基本赋值运算符=
        // 扩展的赋值运算符+= -= *= /= %=
        // 扩展的赋值运算符自带强制类型转换
        double a = 9.5;
        double b = 520;
        a += b;// a = (double)(a+b)
        System.out.println(a);

    }
}
