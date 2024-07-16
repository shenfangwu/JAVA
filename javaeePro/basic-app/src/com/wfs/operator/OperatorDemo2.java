package com.wfs.operator;

/**
 * 自增自减运算符
 */
public class OperatorDemo2 {
    public static void main(String[] args) {
        // 自增、自减运算符++、--：对当前变量加1、减1
        // 只可操作变量，不能用于字面值
        int a = 10;
        ++a;
        System.out.println(a);
        --a;
        System.out.println(a);
        System.out.println("-------------------");
        int i = 10;
        int rs = i--;//先用再操作
        System.out.println(rs);
        System.out.println(i);
        rs =++i;// 先操作再用
        System.out.println(rs);
        System.out.println(i);
    }
}
