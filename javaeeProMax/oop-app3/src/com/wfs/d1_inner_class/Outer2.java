package com.wfs.d1_inner_class;

/**
 * 静态内部类：有static修饰的内部类，属于外部类自己持有
 */
public class Outer2 {
    private String name;
    public static int code;
    public void sayHello(){
        System.out.println("这是外部类方法！");
    }
    public static class inner2{
        public void test(){
            // 1 可直接访问外部类的静态成员
            System.out.println(code);
            // 2 不可访问外部类的实例成员
            // System.out.println(name);
        }
    }
}
