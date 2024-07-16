package com.wfs.javabean;
// 实体类
public class Student {
    private double score;
    private String name;
    public Student(double score, String name) {
        this.score = score;
        this.name = name;
    }
    public Student() {
    }
    public double getScore() {
        return score;
    }
    public void setScore(double score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
