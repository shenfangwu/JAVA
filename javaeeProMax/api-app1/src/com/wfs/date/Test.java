package com.wfs.date;

import java.util.Date;

/**
 * Date：代表日期和时间
 */
public class Test {
    public static void main(String[] args) {
        // 1 创建date对象，代表的是系统当前此刻日期时间
        Date date = new Date();
        System.out.println(date);
        // 2 时间毫秒值转换成Date日期对象
        long time = date.getTime();// 获取从1970.1.1 0.0.0到此刻的总毫秒数
        time += 2* 1000;
        Date date1 = new Date(time);
        System.out.println(date1);
        // 3 设置日期对象的时间为当前时间毫秒值对应的时间
        date.setTime(time+10000);
        System.out.println(date);
    }
}
