package com.wfs.d2_enum;

import java.util.Arrays;

/**
 * 学习枚举
 */
public class Test {
    public static void main(String[] args) {
        // 1 枚举
        A s = A.X;
        System.out.println(s);
        // 编译器为枚举提供一些额外的API
        A[] as = A.values();// 拿到全部对象
        A a = A.valueOf("Z");
        System.out.println(a.name());// Z
        System.out.println(a.ordinal());// 索引
        // 2 抽象枚举
        B b = B.X;
        b.test();

    }
}
