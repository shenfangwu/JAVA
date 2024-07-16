package com.wfs.d2_polymorphism;

public class Student extends People {
    public String name= "Student的名称";
    @Override
    public void run() {
        System.out.println("学生跑的快");
    }
    public void learn(){
        System.out.println("学生在学习");
    }
}
