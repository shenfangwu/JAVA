package com.wfs.pojo;

public class Student {
    private String name;
    private double score;

    private Tel tel;

    public Student() {
    }

    public Student(String name, double score, Tel tel) {
        this.name = name;
        this.score = score;
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", tel=" + tel +
                '}';
    }

    public Tel getTel() {
        return tel;
    }

    public void setTel(Tel tel) {
        this.tel = tel;
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
