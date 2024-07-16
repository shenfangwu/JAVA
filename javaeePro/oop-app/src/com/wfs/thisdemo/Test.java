package com.wfs.thisdemo;

public class Test {
    public static void main(String[] args) {
        // 1 this是一个变量，可以用在方法中，用来拿到当前对象，哪个对象调用方法，this就指向哪个对象
        Student s1 = new Student();
        System.out.println(s1);
        s1.printThis();
        // 2 this用来解决对象的成员变量于方法内部的变量名称一样时，导致访问冲突问题
        s1.printPass(500);
    }
}
