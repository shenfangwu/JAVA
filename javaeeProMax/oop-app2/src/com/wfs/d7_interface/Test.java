package com.wfs.d7_interface;
/**
 * 认识接口
 */
public class Test {
    public static void main(String[] args) {
        // 1 接口不能创建对象，接口时用来被类实现的，实现接口的类成为实现类
        // 2 一个类可是实现多个接口，实现类实现多个接口，
        // 必须重写完全部接口的全部抽象方法，否则实现类需要定义成抽象类
        C c = new C();
        c.testA();
        c.testB();
    }
}
