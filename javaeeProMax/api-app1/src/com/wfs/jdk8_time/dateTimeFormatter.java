package com.wfs.jdk8_time;

import org.w3c.dom.CDATASection;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * DateTimeFormatter 格式化时间
 * 代替SimpleDateFormat
 */
public class dateTimeFormatter {
    public static void main(String[] args) {
        // 1 获取格式化器对象
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dt = LocalDateTime.now();
        // 2 格式化时间
        System.out.println(dateTimeFormatter.format(dt));
        // 3 LocalDateTime提供的格式化、解析时间的方法
        LocalDateTime localDateTime = LocalDateTime.now();
        String str = localDateTime.format(dateTimeFormatter);
        System.out.println(str);
        // 4 LocalDateTime解析时间
        LocalDateTime localDateTime1 = localDateTime.parse("2024-05-04 20:33:12", dateTimeFormatter);
        System.out.println(localDateTime1);
    }
}
