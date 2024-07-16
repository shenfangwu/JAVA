package com.wfs.d1_inner_class;

/**
 * 成员内部类：类中的一个普通成员，类似普通的成员变量、成员方法
 * JDK16以前，成员内部类不允许定义静态成员，JDK16以后也可以定义静态成员了
 */
public class Outer1 {
    private String name;
    public static int code;
    public void sayHello(){
        System.out.println("这是外部类方法！");
    }
    public class inner1{
        public void test(){
            // 1 访问外部类实例成员
            System.out.println(name);
            // 2 访问外部类静态成员
            System.out.println(code);
            // 3 拿到当前外部类对象：外部类名.this
            Outer1.this.sayHello();
        }
    }
}
