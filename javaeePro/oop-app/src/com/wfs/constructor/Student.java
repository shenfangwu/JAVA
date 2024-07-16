package com.wfs.constructor;
// 了解构造器
public class Student {
    double score;
    String name;
    public Student(){// 无参构造器
        System.out.println("这是无参数构造器！");
    }
    public Student(double score,String name){// 有参构造器
        this.score = score;
        this.name = name;
        System.out.println("这是有参数构造器！");
    }

}
