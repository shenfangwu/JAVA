package com.wfs.d1_polymorphism;


public class Teacher extends People{
    public String name = "teacher的名称";
    @Override
    public void run() {
        System.out.println("老师跑的慢");
    }
}
