package com.wfs.d9_api;

import java.util.Objects;

public class Student {
    private String name;
    private double score;

    public Student() {
    }

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }
    // 1 toString默认是返回当前对象在堆内存中的地址信息:类的全类名@十六进制哈希值
    // 重写该函数 使其返回对象内容的字符串格式
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
    // 2 父类equals方法存在的意义就是为了被子类重写，以便子类自己来定制比较规则。
    // 重写使其比较对象内容
    @Override
    public boolean equals(Object o) {
        // 2.1 地址相同则直接返回true
        if (this == o) return true;
        // 2.2 比较的对象是null 或者 两者类型不同 则返回false
        if (o == null || getClass() != o.getClass()) return false;
        // 2.3 类型相同 强制转换类型-》再一一比较属性
        Student student = (Student) o;
        return Double.compare(student.score, score) == 0 && Objects.equals(name, student.name);// Objects类的equals方法
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
