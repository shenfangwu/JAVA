package com.wfs.d1_algorithm;

import java.util.Arrays;

/**
 * 选择排序：美伦选择当前位置，开始找出后面的较小值与该位置交换。
 */
public class Test2 {
    public static void main(String[] args) {
        int arr[] = {5, 3, 1, 2};
        for (int i = 0; i < arr.length - 1; i++) {// 选几次位置
            for (int j = i + 1; j < arr.length; j++) {
                // 每次位置需比较几次
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
