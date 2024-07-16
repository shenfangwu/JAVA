package com.wfs.define;
// 数组的静态初始化
public class ArrayDemo1 {
    public static void main(String[] args) {
        // 1 什么类型的数组就放什么类型数据
        // 2 数据类型【】 数组名 也可以写成数据类型 数组明【】
        int[] num = {1,2,3,4,5};// 推荐使用 一目了然
        double num1[] = {2,4,6,8};
        // 数组是引用数据类型，存储的数组在内存中的地址信息
        System.out.println(num);//[I@776ec8df 
        System.out.println(num1);// [D@4eec7777
    }
}
