package com.wfs.define;
// 学会数组的访问
public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        // 1 访问数组全部数据
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        // 2 修改数组数组
        arr[0] = 17;
        System.out.println(arr[0]);
        // 3 访问数组中的元素个数 最大索引 == 长度-1
        System.out.println(arr.length-1);
    }
}
