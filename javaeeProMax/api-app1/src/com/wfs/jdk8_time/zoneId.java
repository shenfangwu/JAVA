package com.wfs.jdk8_time;

import java.time.Clock;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.TimeZone;

/**
 * Zonld 代表时间id\
 * 代替Calendar
 */
public class zoneId {
    public static void main(String[] args) {
        // 1 获取系统默认时区
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);
        System.out.println(zoneId.getId());
        // 2 获取某个时区的ZoneDateTime对象 带时区的时间
        ZonedDateTime now = ZonedDateTime.now(zoneId);
        System.out.println(now);
        // 3 世界标准时间
        ZonedDateTime now1 = ZonedDateTime.now(Clock.systemUTC());
        System.out.println(now1);
        // 4 获取系统默认时区ZoneDateTime对象
        ZonedDateTime now2 = ZonedDateTime.now();
        System.out.println(now2);

        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone(zoneId));
    }
}
