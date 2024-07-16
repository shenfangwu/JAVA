package com.wfs.d11_extends_method_override;

/**
 * 方法重写:子类写了一个方法名称、形参列表与父类某个方法一样的方法去覆盖父类的该方法
 */
public class Test {
    public static void main(String[] args) {
        // 当子类觉得父类的方法不好用时，或者不满足自己的需求时，就可以重写
        Student student = new Student();
        student.setName("wfs");
        student.setAge(25);
        student.setSex('男');
        student.setScore(100);
        // sout 变量名时 默认 调用toString函数
        // Object的toString方法返回的是内存地址
        // 我们可以重写该方法
        System.out.println(student);
    }
}
