package com.wfs.d12_extends_visit;

/**
 * 就近原则
 */
public class Test {
    public static void main(String[] args) {
        // 1 在子类方法中访问其他成员（成员变量、成员方法），是依照就近原则的
        // 子类局部->子类成员范围->父类成员范围->没找到报错
        Z z = new Z();
        System.out.println(z.name);
        // 2 可以通过super关键字，指定访问父类的成员：super.父类成员
        z.showName();
    }
}
