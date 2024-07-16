package com.wfs.d8_modifer;
/**
 * 权限修饰符：用来限制类中的成员（成员变量、成员方法、构造器、代码块...)能够被访问的范围
 * privated<缺省<protected<public
 */
public class Demo {
    public static void main(String[] args) {
        Father father = new Father();
        // 2 同一包的其他类
        father.publicMethod();
        father.protectedMethod();
        father.Method();
    }
}
