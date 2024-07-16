package com.wfs.demo;

import java.util.Random;
import java.util.Scanner;

// 随机排名
// 先依次录入5名员工的工号，然后展示一组随机的排名顺序
public class Test3 {
    public static void main(String[] args) {
        // 1需要录入---动态数组
        int[] codes = new int[5];
        // 2调用相关功能函数
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        // 3 录入
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入工号！");
            codes[i] = sc.nextInt();
        }
        // 4 随机数组索引然后再进行交换
        for (int i = 0; i < codes.length; i++) {
            int index = r.nextInt(codes.length);
            int temp = codes[index];
            codes[index] = codes[i];
            codes[i] = temp;
        }
        // 5 结果输出
        System.out.println("给出一组随机排名");
        for (int i = 0; i < codes.length; i++) {
            System.out.println(codes[i]);
        }
    }
}
