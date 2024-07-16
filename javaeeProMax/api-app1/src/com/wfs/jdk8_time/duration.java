package com.wfs.jdk8_time;

import java.time.Duration;
import java.time.LocalDateTime;

/**
 * duration
 * 计算两个时间对象相差的天数、小时数、分数、秒数、纳秒数；支持localtime localDateTime、instant等时间
 */
public class duration {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        // 1 传入2个时间对象，得到对象
        Duration dur = Duration.between(ldt,ldt.withYear(600));
        System.out.println(dur);
        // 2 计算相隔几天
        System.out.println(dur.toDays());
        // 3 相隔小时 toHours toMinutes toSeconds toMills toNanos
    }
}
