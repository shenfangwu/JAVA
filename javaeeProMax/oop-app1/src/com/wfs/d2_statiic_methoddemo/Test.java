package com.wfs.d2_statiic_methoddemo;
/**
 * 了解类方法:静态方法
 */
public class Test {
    public static void main(String[] args) {
        // 1 类方法属于类，可以直接用类名访问，也可使用对象访问
        Student.printHello();// 类名.类方法
        Student s = new Student();
        s.printHello();// 对象名.类方法--不推荐

        //  2 无static修饰的成员方法是实例方法
        // 属于对象，只能用于对象访问
        s.score = 70;
        s.pass();// 对象.实例方法
    }
}
