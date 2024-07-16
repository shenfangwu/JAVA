package com.wfs.jdk8_time;

import java.time.LocalDate;
import java.time.Period;

/**
 * period 可以用于计算两个LocaDate对象 相差的年数、月数、天数
 */
public class period {
    public static void main(String[] args) {
        // 1 传入2个日期对象，得到Period对象
        LocalDate localDate0 = LocalDate.now();
        Period period = Period.between(localDate0,localDate0.withYear(2624));
        System.out.println(period);
        // 2 计算隔几年 并返回
        int years = period.getYears();
        System.out.println(years);
        // 3 计算隔几个月，并返回
        int months = period.getMonths();
        System.out.println(months);
        // 4 计算隔几天，并返回
        int days = period.getDays();
        System.out.println(days);
    }
}
