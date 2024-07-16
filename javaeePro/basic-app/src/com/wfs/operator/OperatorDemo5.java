package com.wfs.operator;

/**
 * 逻辑运算符
 */
public class OperatorDemo5 {
    public static void main(String[] args) {
        // 逻辑运算符 & && | || ! ^
        // 注意常用的是：&& || !
        double size = 6.8;
        int storage = 16;
        // 1 &前后都true才true
        boolean rs = size >= 6.95 & storage >= 8;
        System.out.println(rs);
        // 2 |一true都true
        boolean rs1 = size >= 6.95 | storage >= 8;
        System.out.println(rs1);
        // 3 !取反
        System.out.println(!true);
        // 4 ^按位异或运算符 前后结果相同则返回false,不同返回true
        System.out.println(true ^ true);
        // 5 && 左边false时 右边不执行
        int i = 10;
        int j = 20;
        System.out.println(i > 100 && j > 99);
        // 6 || 左边为true，右边不执行
        int m = 10;
        int n = 30;
        System.out.println(m > 3 || ++n > 40);
    }
}
