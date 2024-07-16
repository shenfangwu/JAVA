package com.wfs.math;

/**
 * Math类：工具类，提供对数据进行操作的静态方法
 */
public class Test {
    public static void main(String[] args) {
        // 1 获取参数绝对值
        System.out.println(Math.abs(-29));
        // 2 向上取整
        System.out.println(Math.ceil(4.0001));
        // 3 向下取整
        System.out.println(Math.floor(4.0001));
        // 4 四舍五入
        System.out.println(Math.round(3.3));
        // 5 获取两个int值的较大值
        System.out.println(Math.max(10,20));
        // 6 返回a的b次方
        System.out.println(Math.pow(2,3));// 2的3次方
        // 7 返回double类型随机值[0.0,1.0)
        System.out.println(Math.random());
    }
}
