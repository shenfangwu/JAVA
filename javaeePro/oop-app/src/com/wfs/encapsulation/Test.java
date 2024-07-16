package com.wfs.encapsulation;
// 了解封装
// 1 封装：就是用类设计对象处理某一个事物的数据时，
// 应该把要处理的数据，以及处理这些数据的方法设计到一个对象中去
// 2 面向对象三大特征：封装、继承、多态
// 3 封装的设计规范：合理隐藏合理暴露
public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setScore(10);
        System.out.println(s1.getScore());
    }
}
