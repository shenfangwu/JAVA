package com.wfs.operator;

/**
 * 算数运算符
 */
public class OperatorDemo1 {
    public static void main(String[] args) {
        //1 算数运算符：+ - * / %
        int a = 10;
        int b = 3;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        //2 两个整数相除 其结果一定是整数
        System.out.println(5 / 2);
        System.out.println(5.0 / 2);
        System.out.println("------------------------");
        //3 + 除了做加法还可以当作连接符:能加则加 否则就连
        int a2 = 101;
        System.out.println("abc"+a2);
        System.out.println(a2+5);
        System.out.println("hangdanyuan"+a2+'a');
    }
}
