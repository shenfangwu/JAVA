package com.wfs.d5_singleinstance;

/**
 * 饿汉式单例设计模式
 */
public class Student1 {
    // 2 定义一个类变量记住类的一个对象
    // 利用类变量跟类在内存加载一次的特点，确保只会创建一个对象
    // 为了更好的封装，让该类变量变成私有的=>只能通过公共类方法来得到本对象
    private static Student1 student1 = new Student1();

    // 1 把类的构造器私有
    // 外部就不会构造对象了=>只能通过类成员来访问
    private Student1() {
    }

    // 3 定义一个类方法返回对象
    public static Student1 getInstance() {
        return student1;
    }
}
