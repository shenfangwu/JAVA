package com.wfs.d4_map;

import java.util.HashMap;

/**
 * HashMap:无序、不重复、无索引, HashSet基于HashMap实现
 * 增删改查数据，性能都不错
 * HashMap的键依赖hashCode方法和equals方法保证键的唯一
 * 若键存储的是自定义类型的对象，可以通过重写hashCode和equals方法，
 * 这样可以保证多个对象内容一样，HashMap集合认为是重复的
 */
public class Test4_hashMap {
    public static void main(String[] args) {
        HashMap<Student,String> studentHashMap = new HashMap<>();
        studentHashMap.put(new Student("蜘蛛精",22),"101");
        studentHashMap.put(new Student("蜘蛛精",23),"102");
        studentHashMap.put(new Student("蜘蛛精",22),"103");
        System.out.println(studentHashMap);
    }
}
