package com.wfs.simpledateformat;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * SimpleDateFormat代表日期格式化，可以用来把日期对象、时间毫秒值格式化成我们想要的格式
 */
public class Test {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date);
        long  time = date.getTime();
        // 1 创建简单日期格式化对象，并封装时间的格式
        // yyyy年 MM月 dd日 H时 m分 s秒 EEE星期几 a上午/下午
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EEE a");
        // 2 format方法可以接受 Date以及long格式
        String s = sdf.format(date);
        String s1 = sdf.format(time);
        System.out.println(s);
        System.out.println(s1);
        // 3 SimpleDateFormat解析字符串时间为日期对象
        String s0 = "2024-4-8 11.11.11";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH.mm.ss");// 格式要与字符串一致
        System.out.println(sdf1.parse(s0));
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH.mm.ss");
        System.out.println(sdf2.format(sdf1.parse(s0)));
    }
}
