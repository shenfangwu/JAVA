package com.wfs.random;

import java.util.Random;

// 学习使用Random
public class RandomDemo {
    public static void main(String[] args) {
        // 1导包
        // 2 创建一个Random对象，用于生成随机数
        Random r = new Random();
        // 3 调用Random提供的功能，用于生成随机数
        for (int i = 0;i<20;i++) {
            int res = r.nextInt(10);// 0-9
            System.out.println(res);
        }
        System.out.println("--------------------------------");
        // 4 练习：生成 4-19的随机数：先减再加
        for (int i = 0;i<10;i++) {
            int RandomNum = r.nextInt(15)+4;
            System.out.println(RandomNum);
        }
    }
}
