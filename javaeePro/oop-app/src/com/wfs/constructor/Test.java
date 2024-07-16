package com.wfs.constructor;

public class Test {
    public static void main(String[] args) {
        // 1 对象创建时可以指定对象去调用哪个构造器去执行
        // 2 构造器用于完成对象的初始化
        Student s1 = new Student();
        Student s2 = new Student(100,"wfs");
        // 3 类在设计时，如果不写构造器，JAVA会为类自动生成一个无参构造器
        // 4 一旦定义了有参构造器，JAVA就不会为类自动生成一个无参构造器，此时需要自己手动写一个无参构造器
        Teacher t = new Teacher();
    }
}
