package com.wfs.d10_extends_feature;

/**
 * 继承相关需要注意的事项
 */
public class Test {
    public static void main(String[] args) {
        // 1 Java是单继承的：一个类只能继承一个直接父类;
        // java不支持多继承，但是支持多层继承
        C c = new C();
        // 2 Object类是所有类的祖宗
    }
}
class A{// 默认继承Object

}
class B extends A{

}
class C extends B{// 支持多层继承

}