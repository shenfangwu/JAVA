package com.wfs.d1_polymorphism;
/**
 * 多态：多态是在继承/实现情况下的一种现象，表现为：对象多态、行为多态
 */
public class Test {
    public static void main(String[] args) {
        // 1 对象多态
        People p1 = new Teacher();
        People p2 = new Student();
        // 2 行为多态
        p1.run();// 识别技巧：编译看左边，运行看右边
        p2.run();
        // 3 多态的前提是：有继承/实现关系；存在父类引用子类对象；存在方法重写
        // 4 多态是对象、行为的多态，java中的属性（成员变量）不谈多态
        System.out.println(p1.name);// 识别技巧：编译看左边，运行看左边
        System.out.println(p2.name);
    }
}
