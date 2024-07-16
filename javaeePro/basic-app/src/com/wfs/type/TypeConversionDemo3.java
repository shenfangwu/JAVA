package com.wfs.type;

/**
 * 强制转换
 */
public class TypeConversionDemo3 {
    public static void main(String[] args) {
        // 强制类型转换：强行将类型范围大的变量、数据赋值给类型范围小的变量
        int a = 20;
        byte b = (byte) a;
        System.out.println(a);
        // 1 可能会造成数据溢出
        int i = 10000;
        byte j = (byte) i;
        System.out.println(j);
        // 2 浮点型转换整形，直接丢掉小数部分，保留整数部分返回
        double d = 99.9;
        int m = (int) d;
        System.out.println(m);
    }
}
