package com.wfs.d13_extends_contructor;

/**
 * 子类的全部构造器，都会先调用父类的构造器，再执行自己的
 */
class F{
    public int age;
    public F(){
        System.out.println("===父类F的无参数构造函数");
    }

    public F(int age) {
        this.age = age;
        System.out.println("===父类F的有参数构造函数");
    }
}
class Z extends F{
    public Z() {
        // super()默认存在
        System.out.println("===子类Z 无参数构造函数");
    }

    public Z(int age) {
        // super()默认存在
        System.out.println("===子类Z 有参数构造函数");
    }
}
public class Test {
    public static void main(String[] args) {
        // 1 默认 子类全部构造器的第一行代码是super()，它会调用父类的无参数构造器
        // 2 若父类没有无参数构造器，则我们必须在子类构造器的第一行手写super(),指定调用父类的有参数构造器
        Z z = new Z();
        Z zz = new Z(10);
    }
}
