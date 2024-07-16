package com.wfs.calendar;

import java.util.Calendar;
import java.util.Date;

/**
 * Calendar代表系统此刻时间对应的日历，通过它可以单独获取，修改日期中的年、月、日、时、分、秒等
 */
public class Test {
    public static void main(String[] args) {
        // 1 获取当前日历对象 calendar是可变对象，一旦修改后其对象本身表示的时间将产生变化
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        // 2 get方法获取日历中的某个日期
        System.out.println(calendar.get(Calendar.YEAR));
        // 3 获取日期对象
        Date date = calendar.getTime();
        System.out.println(date);
        // 4 获取时间毫秒值
        long time = calendar.getTimeInMillis();
        System.out.println(time);
        // 5 修改日历的某个信息
        calendar.set(Calendar.YEAR,1);
        System.out.println(calendar.get(Calendar.YEAR));
        // 6 为某个信息增加/减少指定的值
        calendar.add(Calendar.YEAR,2023);
        System.out.println(calendar.get(Calendar.YEAR));
    }
}
