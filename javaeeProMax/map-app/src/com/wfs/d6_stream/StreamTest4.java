package com.wfs.d6_stream;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Stream流终结方法
 */
public class StreamTest4 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student s1 = new Student("wfs",26);
        Student s2 = new Student("lgc",23);
        Student s3 = new Student("jsc",22);
        Student s4 = new Student("qf",21);
        Student s5 = new Student("fbq",33);
        Student s6 = new Student("wfs",20);
        Student s7 = new Student("lgc",23);
        Collections.addAll(students,s1,s2,s3,s4,s5,s6,s7);
        // 1 计算出年龄超过20的有几人
        long sz = students.stream().filter(s->s.getAge()>25).count();
        System.out.println(sz);
        // 2 找出年龄最大的
        Student student = students.stream().max((o1,o2)-> Double.compare(o1.getAge(),o2.getAge())).get();
        System.out.println(student);
        // 3 找出年龄最小的
        Student student1 = students.stream().min((o1,o2)-> Double.compare(o1.getAge(),o2.getAge())).get();
        System.out.println(student1);
        // 4 年龄超过25的人 放到一个集合中
        // 流用一次就会关闭
        List<Student> list= students.stream().filter(s->s.getAge()>20).collect(Collectors.toList());
        System.out.println(list);
        Map<String,Integer> map= students.stream().filter(s->s.getAge()>20)
                .distinct().collect(Collectors.toMap(Student::getName, Student::getAge));
        map.forEach((k,v)->{
            System.out.print(k+"------>"+v+" ");
        });
    }
}
