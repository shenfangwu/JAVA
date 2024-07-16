package com.wfs.d1_algorithm;

import java.util.Arrays;

/**
 * 冒泡排序
 * 从左到右，相邻元素进行比较。每次比较一轮，就会找到序列中最大的一个或最小的一个。这个数就会从序列的最右边冒出来
 */
public class Test1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 8, 7, 0, 4, 0, 2, 8, 0, 5, 1};
        for (int i = 0; i < arr.length - 1; i++) {// 一共几轮
            for (int j = 0; j < arr.length - i - 1; j++) {// 每轮内交换几次
                if (arr[j] <= arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
