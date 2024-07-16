package com.wfs.demo;
// 数组反转
public class Test2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for (int i = 0,j = arr.length-1; i < j; i++,j--) {
            // 交换数组元素
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
