package com.wfs.d9_interface_demo;

import java.util.ArrayList;

class Student{
   private String name;
   private char sex;
   private double score;

    public Student(String name, char sex, double score) {
        this.name = name;
        this.sex = sex;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
// 实体类-》操作类-》定义2个接口对应2种方案-》操作类实现接口
public class ClassManager {
    // 储存学生信息
    private ArrayList<Student> studentArrayList = new ArrayList<>();
    private classOperator classOperator = new classOperator();

    public ClassManager() {
        studentArrayList.add(new Student("wfs",'男',100));
        studentArrayList.add(new Student("jsc",'男',80));
        studentArrayList.add(new Student("ww",'男',70));
        studentArrayList.add(new Student("wlz",'男',60));
    }

    public void showAllInfo(){
        classOperator.showAllInfo(studentArrayList);
    }
    public void showAllAve(){
        classOperator.showAllAve(studentArrayList);
    }

}
