package com.wfs.d6_extends;

/**
 * 学习继承extends
 */
public class Test {
    public static void main(String[] args) {
        // 1继承就是用extends关键字，让一个类和另一个类建立起一种父子关系
        // 2子类可以继承父类非私有的成员
        B b = new B();
        b.printB();
        // 3 对于子类，java会用这个类与其父类，多张设计图一起创建类的对象；
        // 该对象可以访问的成员，是由子父类多张设计图共同决定的，这多张设计图对外暴露什么成员，对象就可以访问什么成员

    }
}
