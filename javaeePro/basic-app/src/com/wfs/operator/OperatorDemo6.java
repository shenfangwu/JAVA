package com.wfs.operator;

/**
 * 三元运算符及运算符优先级
 */
public class OperatorDemo6 {
    public static void main(String[] args) {
        // 1 三元运算符：若值为true，返回值1，若为false,返回值2
        int a = 99;
        int b = 69;
        int max = a > b ? a : b;
        System.out.println(max);
        // 2 在表达式中，哪个运算符先执行看优先级
        // 其中&&的优先级大于||
        System.out.println(10>3||10>3&&10<3);// true
    }
}
