package com.wfs.d12_extends_visit;

public class Z extends F{
    String name = "子类名称";
    public void showName(){
        String name = "局部名称";
        System.out.println(name);// 局部名称
        System.out.println(this.name);// 子类成员变量
        System.out.println(super.name);// 父类的成员变量
    }
}
