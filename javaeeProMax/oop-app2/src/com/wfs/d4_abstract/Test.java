package com.wfs.d4_abstract;

/**
 * 了解抽象类：abstract修饰类，这个类就是抽象类；修饰方法，就是抽象方法
 */
public class Test {
    public static void main(String[] args) {
        // 1 抽象类可以不写抽象方法，但是有抽象方法的类一定是抽象类
        // 2 类有的成员，抽象类都具备
        // 3 抽象类不可创建对象，仅仅作为一种特殊的父类，让子类继承并实现
        // 4 一个类若继承抽象类，必须重写完抽象类的全部抽象方法；否则这个类也必须定义成抽象类
    }
}
abstract class A{
    // 抽象方法：必须abstract修饰，只有方法签名，不能有方法体
    public abstract void test();
    public int num;
}
class B extends A{
    public void test(){
        System.out.println("hello");
    }
}
