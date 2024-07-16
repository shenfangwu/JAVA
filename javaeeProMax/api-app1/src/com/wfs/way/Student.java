package com.wfs.way;

public class Student implements Comparable<Student>{
    private String name;
    private double score;
    private int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", age=" + age +
                '}';
    }

    // 按年龄 升序
    @Override
    public int compareTo(Student o) {
        return this.age-o.age;
    }

    public Student() {
    }

    public Student(String name, double score, int age) {
        this.name = name;
        this.score = score;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
