package com.wfs.d2_statiic_methoddemo;

public class Student {
    public static void printHello(){
        System.out.println("Hello World");
    }
    public double score;
    public void pass(){
        if(score > 60){
            System.out.println("通过！");
        }else{
            System.out.println("失败！");
        }
    }
}
