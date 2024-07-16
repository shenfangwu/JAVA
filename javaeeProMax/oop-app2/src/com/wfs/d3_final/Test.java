package com.wfs.d3_final;

/**
 * 学习final:最终的意思，可以修饰类、方法、变量
 */
public class Test {
    // public static final修饰的成员变量就是常量、建议名称大写，多个单词下划线链接
    public static final String NAME = "wfs";
    public static void main(String[] args) {
    // 3 final可以修饰变量，总规则：有且仅能赋值一次
        /*
        变量：
            一、局部变量
            二、成员变量
                1、静态成员变量
                2、实例成员变量
         */
        // final修饰的变量，其存储的数据不可被改变
        // final修饰的引用类型变量，变量存储的地址不会改变，但是指向的对象内容可改变
        final int a;
        a = 12;
        // a = 13;错误
    }
}
// 1 final修饰类-最终类，类不能再继承了
final class A{ }
// class B extends A{}

// 2 final修饰方法-最终方法，方法不能被重写了
class C{
    public final void test(){

    }
}
class D extends C{
//    @Override
//    public void test(){
//
//    }
}