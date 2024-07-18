package com.wfs.d3_set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * TreeSet
 * 不重复 无索引 可排序（规则自定义
 * 基于红黑树排序
 */
public class Test4_TreeSet {
    public static void main(String[] args) {
        // 方法2 通过调用TreeSet集合的有参构造器，可以设置Comparator对象（比较器对象、用于指定比较规则）
        Set<Student> students = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        students.add(new Student("wfs",25));
        students.add(new Student("jsc",26));
        students.add(new Student("qf",31));
        students.add(new Student("lgc",25));
        System.out.println(students);
    }
}
