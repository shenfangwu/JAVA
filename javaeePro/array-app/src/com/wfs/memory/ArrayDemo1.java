package com.wfs.memory;
// 了解内置变量、引用变量在计算机的执行原理
public class ArrayDemo1 {
    public static void main(String[] args) {
        // 1 class文件装入方法区、内置变量在栈内存创建、引用变量在堆内存创建
        int a = 20;// 栈
        System.out.println(a);

        int[] arr = new int[]{11,22,33};// arr在栈 然后在堆开辟一个int[3]区域存储内容
        System.out.println(arr);

        arr[0] = 44;// 在栈内通过arr存储的地址去寻找堆里变量位置
        System.out.println(arr[0]);
    }
}
