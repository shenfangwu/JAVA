package com.wfs.d8_interface;
/**
 * 接口的好处
 */
interface Driver {
    public abstract void drive();
}
interface Singer {
    public abstract void sing();
}
// 1 可以解决类单继承的问题，通过接口，我们可以让一个类有一个功能的同时，可以扩展自己的功能
class Student implements Singer,Driver{
    @Override
    public void drive() {
        System.out.println("学生在开车！");
    }

    @Override
    public void sing() {
        System.out.println("学生在唱歌！");
    }
}
// 2 一个接口也可以被多个类实现的，这样我们就可以面向接口编程了
class Teacher implements Singer{
    @Override
    public void sing() {
        System.out.println("老师在唱歌！");
    }
}
public class Test {
    public static void main(String[] args) {
        Driver d = new Student();
        d.drive();
    }
}
