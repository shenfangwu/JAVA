package com.wfs.d5_singleinstance;

/**
 * 懒汉式单例写法：拿对象时才开始创建对象
 */
public class Student2 {
    // 2 定义类变量用于存储对象--先不创建对象
    private static Student2 student2;
    // 1 构造器私有
    private Student2() {

    }
    // 3 提供一个类方法，保证返回的是同一个对象
    public static Student2 getInstance() {
        if (student2 == null) {
            student2 = new Student2();
        }
        return student2;
    }
}
