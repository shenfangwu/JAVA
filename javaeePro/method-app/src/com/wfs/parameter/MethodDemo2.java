package com.wfs.parameter;

// 引用类型的参数传递
// 1传递的是地址值
// 2也是值传递
public class MethodDemo2 {
    public static void main(String[] args) {
        int[] arrs = new int[]{10, 20, 30};
        change(arrs);
        System.out.println("main: " + arrs[1]);
    }

    public static void change(int[] arrs) {
        System.out.println("方法1内： " + arrs[1]);
        arrs[1] = 22;
        System.out.println("方法2内： " + arrs[1]);
    }
}
