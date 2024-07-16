package com.wfs.d6_extends;

public class B extends A{
    public void printB(){
        System.out.println("这是B类公有函数");
        System.out.println("这是从A类继承的成员"+num);
        printA();
    }
}
