package com.wfs.type;

/**
 * 表达式的自动转换
 */
public class TypeConversionDemo2 {
    public static void main(String[] args) {
        // 表达式中，小范围类型的变量会转换成较大类型的变量byte、short、char==>int==>long==>float==>double
        // 表达式中的最终结果类型由表达式最高类型决定
        // 在表达式中byte、short、char是直接转换成int类型进行运算的
        byte num1 = 10;
        int num2 = 10;
        short num3 = 10;
        long sum = num2 + num1 + num3;
        System.out.println(sum);

        double rs2 = num2+num1+num3;
        System.out.println(rs2);

        byte b1 = 110;
        byte b2 = 80;
        int b3 = b1 + b2;//此时b1 b2 为int类型
        System.out.println(b3);
    }
}
