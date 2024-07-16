package com.wfs.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.IntToDoubleFunction;

/**
 * Arrays用来操作数组的工具类
 * 提供一些类方法
 */
public class Test {
    public static void main(String[] args) {
        // 1 返回数组的内容
        int[]arr = new int[]{10,30,50,70,100};
        System.out.println(Arrays.toString(arr));
        // 2 拷贝数组 指定范围
        int[]arr1 = Arrays.copyOfRange(arr,1,3);// 左闭右开
        System.out.println(Arrays.toString(arr1));
        // 3 拷贝数组
        int[]arr2 = Arrays.copyOf(arr,3);// 指定长度
        System.out.println(Arrays.toString(arr2));
        // 4 将数组数据改为新数据
        double[] da = new double[]{1,2,3,4,5};
        // setAll函数接收一个double数组 和 匿名内部类
        // 循环对double数组的每一个元素 执行匿名内部类中的方法
        // IntToDoubleFunction(){}是一个匿名内部类 继承的是一个名为IntToDoubleFunction的接口
        Arrays.setAll(da, new IntToDoubleFunction() {
            @Override
            public double applyAsDouble(int value) {
                return da[value]*0.7;
            }
        });
        System.out.println(Arrays.toString(da));
        // 5 排序
        Arrays.sort(arr);
        System.out.println( Arrays.toString(arr));

    }
}
