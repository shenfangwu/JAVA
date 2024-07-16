package com.wfs.d4_block;

/**
 * 了解代码块:代码块是类的5大成分之一（成员变量、构造器、方法、代码块、内部类）
 */
public class Test {
    public static void main(String[] args) {
        // 1 代码块分为2种：静态代码块 动态代码块
        // 2 静态代码块特点是：类加载时自动执行，由于类只会加载一次，所以静态代码块也只执行一次
        // 完成类的初始化：对类变量的初始化赋值
        System.out.println(Student.number);
        System.out.println(Student.number);
        System.out.println(Student.number);
        System.out.println("----------------------------");
        // 3 实例代码块特点：每次创建对象时，执行实例代码块，并在构造器前执行
        // 完成对象的初始化，对实例变量赋值
        Student student = new Student();
        Student student1 = new Student();
        Student student2 = new Student();

    }
}
