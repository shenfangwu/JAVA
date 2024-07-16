package com.wfs.d2_polymorphism;


public class Teacher extends People {
    public String name = "teacher的名称";
    @Override
    public void run() {
        System.out.println("老师跑的慢");
    }
    public void teach(){
        System.out.println("老师在上课");
    }
}
