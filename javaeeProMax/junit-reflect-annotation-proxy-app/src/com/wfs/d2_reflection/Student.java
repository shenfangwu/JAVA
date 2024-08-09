package com.wfs.d2_reflection;

public class Student {
    public String name;
    public int age;
    public double score;

    public void run(){
        System.out.println("跑步中。。。");
    }
    public void sing(){
        System.out.println("唱歌中。。。");
    }
    public void sleep(){
        System.out.println("睡觉中。。。");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Student() {
    }

    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
