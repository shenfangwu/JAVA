package com.wfs.define;
// 数组的动态初始化
public class ArrayDemo5 {
    public static void main(String[] args) {
        // 1 动态初始化的写法: 数据类型[] 数组名 = new 数据类型[长度]
        int[] array = new int[3];
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);// 默认值为0
        }
        // 1-1 知道值的简化写法
            int[] arr = new int[]{1,2,3,4};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);// 默认值为0
        }
        // 2 byte short char int long类型数组的元素默认值为0；
        // float double默认值为0.0
        // boolean默认为false String默认为null
        String[] str = new String[3];
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);// 默认值为null
        }
        // 3 动态数组适用于知道元素个数 不知道具体值的业务场景
        // 静态数组适用于知道存入哪些元素值的业务场景
    }
}
