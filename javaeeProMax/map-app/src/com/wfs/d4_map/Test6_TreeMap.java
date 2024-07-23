package com.wfs.d4_map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * TreeMap
 * 不重复、无索引、可排序（只对键排序）
 * TreeMap跟TreeSet集合的底层原理一样，基于红黑树
 * 排序规则：
 *         让类实现Comparable接口，重写比较规则
 *         TreeMap集合有一个有参数构造器，支持创建Comparator比较器对象，以便指定比较规则
 */
public class Test6_TreeMap {
    public static void main(String[] args) {
        Map<Student,String> maps = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o1.getAge(),o2.getAge());
            }
        });
        maps.put(new Student("wfs",100),"101");
        maps.put(new Student("jsc",10),"102");
        maps.put(new Student("lgc",30),"103");
        System.out.println(maps);
    }
}
