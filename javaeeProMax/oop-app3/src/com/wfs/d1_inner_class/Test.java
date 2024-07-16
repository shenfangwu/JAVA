package com.wfs.d1_inner_class;

/**
 * 学习内部类:成员内部类、静态内部类、局部内部类、匿名内部类
 */
public class Test {
    public static void main(String[] args) {
        // 1 成员内部类创建对象
        Outer1.inner1 in1 = new Outer1().new inner1();
        // 2 静态内部类创建对象
        Outer2.inner2 in2 = new Outer2.inner2();
        // 3 局部内部类是定义在方法、代码块、构造器等执行体中
        class  inner3{

        }
        inner3 inner3 = new inner3();
        // 4 匿名内部类:本质是一个子类，并会立即创建一个子类对象
        // 该类没有名字
        // 可以不需要没有实例化这个接口的类，便实现了里面的方法-》简化了代码
        Running r = new Running() {
            @Override
            public void run() {
                System.out.println("跑步！！！");
            }
        };
        go(r);
    }
    // 4-1 匿名内部类通常作为一个参数传输给方法
    public static void go(Running s){
        System.out.println("开始----------------");
        s.run();
    }
}

interface Running{
    void run();
}
