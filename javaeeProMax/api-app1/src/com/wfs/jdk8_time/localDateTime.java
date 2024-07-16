package com.wfs.jdk8_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * 代表本地日期、时间（年、月、日、星期、时、分、秒、纳秒）
 * 代替Calendar
 */
public class localDateTime {
    public static void main(String[] args) {
        // 1 获取是localDate + localTime的所有方法
        // 2 修改同上
        // 3 加同上
        // 4 减同上
        // 5 是否相同 在前在后
        // 6 LocalDateTime可以转换成LocalDate和LocalTime
        LocalDateTime ldt = LocalDateTime.now();
        LocalDate ld = ldt.toLocalDate();
        LocalTime lt = ldt.toLocalTime();
        System.out.println(ldt);
        System.out.println(ld);
        System.out.println(lt);
    }
}
