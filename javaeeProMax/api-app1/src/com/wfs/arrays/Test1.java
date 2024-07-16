package com.wfs.arrays;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 排序
 */
public class Test1 {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("wfs",100);
        students[1] = new Student("jsc",90);
        students[2] = new Student("lgc",80);
        // 1 让该对象类实现Comparable（比较规则）接口,然后重写compareTo方法，自己指定比较规则
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
        // 2 使用Arrays类的sort方法，创建Comparator比较器接口的匿名内部类对象，然后自己指定规则
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                // 降序
                if(o1.score > o2.score){
                    return -1;
                } else if (o1.score < o2.score) {
                    return 1;
                }else {
                    return 0;
                }
            }
        });
        System.out.println(Arrays.toString(students));
    }
}
