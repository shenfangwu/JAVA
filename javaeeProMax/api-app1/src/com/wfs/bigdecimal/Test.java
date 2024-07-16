package com.wfs.bigdecimal;

import java.math.BigDecimal;

/**
 * BigDecimal
 * 用于解决浮点数运算时，出现结果失真的问题
 */
public class Test {
    public static void main(String[] args) {
        // 1 double类型做运算会有精度缺失的风险
        double d1 = 0.1;
        double d2 = 0.2;
        System.out.println(d1+d2);// 0.30000000000000004
        // 2 使用bigDecimal会避免丢失精度
        BigDecimal bg1 = new BigDecimal("0.1");// 建议使用String初始化bigdecimal
        BigDecimal bg2 = new BigDecimal("0.3");
        BigDecimal bg3 = BigDecimal.valueOf(d2);
        System.out.println(bg1.add(bg2));// 0.3
        // 3 减法 乘法 除法
        System.out.println(bg1.subtract(bg2));
        System.out.println(bg1.multiply(bg2));
        System.out.println(bg1.divide(bg2,2));// 可以控制精确到小数几位
        // 4 将BigDecimal转换为double
        double d = bg1.divide(bg2,2).doubleValue();
        System.out.println(d);
    }
}
