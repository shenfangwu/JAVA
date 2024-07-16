package com.wfs.jdk8_time;

import java.time.Instant;

/**
 * Instant 时间线上的某个时刻/时间戳
 * 通过获取instant对象可以拿到此刻的时间，该时间由两部分组成：从1970-01-01 00:00:00开始走到此刻的总秒数+不够1秒的纳秒数
 * 作用：记录代码的执行时间、用户操作某个事件的时间点
 * 精确到纳秒、不可变对象；推荐代替Date
 */
public class instant {
    public static void main(String[] args) {
        // 1 获取当前时间instant对象
        Instant instant = Instant.now();
        System.out.println(instant);
        // 2 获取从1970-01-01T00:00:00开始记录的秒数
        long time = instant.getEpochSecond();
        System.out.println(time);
        // 3 从时间线开始 获取第二个开始的纳秒数
        int na = instant.getNano();
        System.out.println(na);
        // 4 增加 plusMillis plusSeconds plusNanos
        // 5 减少 minus
        // 6 判断 equals isBefore isAfter
    }
}
