package com.wfs.d6_stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/**
 * Stream流中间方法
 */
public class StreamTest3 {
    public static void main(String[] args) {
        ArrayList<Double> scores = new ArrayList<>();
        Collections.addAll(scores,88.5,28.3,22.1,47.7,87.7,97.5,100.3);
        // 1 找出成绩>=60分的数据，并升序后，输出
        scores.stream().filter(s->s>=60).sorted().forEach(System.out::println);
        // 2 找出年龄>=23且<=30的，并年龄降序后，再输出
        List<Student> students = new ArrayList<>();
        Student s1 = new Student("wfs",26);
        Student s2 = new Student("lgc",23);
        Student s3 = new Student("jsc",22);
        Student s4 = new Student("qf",21);
        Student s5 = new Student("fbq",33);
        Student s6 = new Student("wfs",20);
        Student s7 = new Student("lgc",23);
        Collections.addAll(students,s1,s2,s3,s4,s5,s6,s7);
        students.stream().filter(s->s.getAge()>=23&&s.getAge()<=30).sorted((o1,o2)-> o2.getAge()-o1.getAge()).
                forEach(s-> System.out.print(s.getAge()+" "));
        System.out.println();
        // 3 找年龄最高的前3名学生再输出
        System.out.println("找年龄最高的前3名学生再输出");
        students.stream().sorted().limit(3).forEach(System.out::println);
        // 4 找出年龄倒数的2名学生再输出
        System.out.println("找出年龄倒数的2名学生再输出");
        students.stream().sorted((o1,o2)-> o2.getAge()-o1.getAge()).
                skip(students.size()-2).forEach(System.out::println);
        // 5 找出年龄超过20的学生，叫啥名字，去除重复名字，再输出
        students.stream().filter(s->s.getAge()>20).map(Student::getName)
                .distinct().forEach(z-> System.out.print(z+" "));
        System.out.println();
        System.out.println("distinct对自定义对象（内容相同则一样）需要重写hashcode和equals");
        students.stream().filter(s->s.getAge()>20)
                .distinct().forEach(z-> System.out.print(z+" "));
        // 6 拼接 concat
        System.out.println("----------------------流拼接------------------------");
        Stream<String> st1 = Stream.of("wfs","jsc");
        Stream<String> st2 = Stream.of("wfs","jsc","qf");
        Stream<String> st3 = Stream.concat(st1,st2);
        st3.forEach(s -> System.out.println(s));
    }
}
