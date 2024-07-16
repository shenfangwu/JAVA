package com.wfs.d13_extends_contructor;
class Fa{
    public int age;
    public Fa(int age) {
        this.age = age;
        System.out.println("===父类Fa的有参数构造函数");
    }
}
class Za extends Fa{
    public Za() {
        super(10);
        System.out.println("===子类Za 无参数构造函数");
    }

    public Za(int age) {
        super(10);
        System.out.println("===子类Za 有参数构造函数");
    }
}
public class Test2 {
    // 2 若父类没有无参数构造器，则我们必须在子类构造器的第一行手写super(),指定调用父类的有参数构造器
    public static void main(String[] args) {
        Za za = new Za();
    }
}
