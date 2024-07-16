package com.wfs.d1_staticdemo;
/**
 * 了解static
 */
public class Test {
    public static void main(String[] args) {
        // 1 static 是静态，可以修饰成员变量、成员方法

        // 2 static修饰的成员变量是类变量;
        // 特点：类变量与类一起加载一次，在内存中只有一份，会被类的所有对象共享
        Student.name = "wfs";// 类名.类变量 --- 推荐
        Student student = new Student();
        student.name = "yby";// 对象名.类变量 --- 不推荐
        System.out.println(student.name);
        System.out.println(Student.name);

        // 3 无static修饰的成员变量叫做实例变量（对象变量）
        // 特点：属于对象，每个对象中都有一份
        System.out.println(student.age);
        student.age = 25;// 对象.实例变量
        System.out.println(student.age);

    }
}
