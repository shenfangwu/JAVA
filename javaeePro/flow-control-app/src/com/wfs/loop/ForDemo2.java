package com.wfs.loop;

/**
 * 使用for循环批量生产数据
 */
public class ForDemo2 {
    public static void main(String[] args) {
        int sum = 0;// 定义变量用于累加
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("1-100的数据和: "+sum);
    }
}
