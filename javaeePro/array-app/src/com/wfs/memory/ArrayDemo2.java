package com.wfs.memory;
// 多数组变量指向同一数组对象
public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] arr1 = {11,22,33};
        int[] arr2 = arr1;// java允许用数组名初始化数组
        System.out.println(arr1);
        System.out.println(arr2);// arr1 arr2 储存地址一致
        arr2 = null;
        System.out.println(arr2[1]);// 报错
    }
}
