package com.wfs.d10_interface_jdk8;

public interface A {
    // 1 默认会被加上public修饰
    // 只能使用接口的实例类对象调用
    default void test1(){

    }
    // 2 私有方法：必须用private
    // 在接口的其他方法中可以调用
    private void test2(){

    }
    // static修饰，默认是public
    // 只可通过接口名调用
    static void test3(){

    }
}
