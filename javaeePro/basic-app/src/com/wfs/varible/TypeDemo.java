package com.wfs.varible;

/**
 * 变量类型
 */
public class TypeDemo {
    public static void main(String[] args) {
        // 1整型
        byte number = 88;
        System.out.println(number);
        short number2 = 8000;
        int number3 = 314314527;// 默认
        // 注意：整形字面量默认是int，若希望写的整形字面量是long，需要在后面加上L/l;
        long number4 = 5000000000000L;
        // 2 浮点型
        // 注意：浮点型字面量默认是double，若希望写的浮点型字面量是float，需要在后面加上F/f;
        float score1 = 99.5F;
        double score2 = 99.8;
        // 3 字符型
        char ch1 = 'a';
        char ch2 = '中';
        char ch3 = '国';
        // 4 布尔型
        boolean b1 = true;
        boolean b2 = false;
        // 引用数据类型String
        String name = "wfs";
    }
}
