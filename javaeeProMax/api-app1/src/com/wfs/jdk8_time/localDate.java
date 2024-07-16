package com.wfs.jdk8_time;

import java.time.LocalDate;

/**
 * localDate 代表本地日期（年、月、日、星期）
 * 代替Calendar
 */
public class localDate {
    public static void main(String[] args) {
        // 1 获取系统当前时间对应的该对象
        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        // 2 获取指定时间的对象
        LocalDate ld0 = LocalDate.of(2024,10,1);
        System.out.println(ld0);
        // 3 常用API 获取
        System.out.println(ld.getYear());
        System.out.println(ld.getMonthValue());
        System.out.println(ld.getDayOfMonth());// 月中第几天
        System.out.println(ld.getDayOfYear());// 年中第几天
        System.out.println(ld.getDayOfWeek());// 周中第几天
        // 4 withYear withMonth withDayofMonth withDayOfYear 修改信息，返回新日期对象
        System.out.println(ld.withYear(2034));
        // 5 plusYears plusMonths plusDays plusWeeks 加 返回新日期对象
        System.out.println(ld.plusDays(100));
        // 6 minusYears minusMonths minusDays minusWeeks 减 返回新日期对象
        System.out.println(ld.minusWeeks(30));
        // 7 equals isBefore isAfter 判断两个日期对象，是否相等，在前在后
        System.out.println(ld.equals(ld0));
        System.out.println(ld.isBefore(ld0));
    }
}
