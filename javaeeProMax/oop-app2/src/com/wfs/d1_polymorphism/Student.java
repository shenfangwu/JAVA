package com.wfs.d1_polymorphism;

public class Student extends People{
    public String name= "Student的名称";
    @Override
    public void run() {
        System.out.println("学生跑的快");
    }
}
