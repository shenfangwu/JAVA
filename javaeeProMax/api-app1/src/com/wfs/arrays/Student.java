package com.wfs.arrays;

public class Student implements Comparable<Student>{
    public String name;
    public double score;

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        // 约定1 认为左边对象 大于 右边对象 ==》返回正整数
        // 约定2 认为左边对象 小于 右边对象 ==》返回负整数
        // 约定3 认为左边对象 等于 右边对象 ==》返回0

        // 升序
        if(this.score > o.score){
            return 1;
        } else if (this.score < o.score) {
            return -1;
        }else {
            return 0;
        }
    }

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
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
