package com.wfs.overload;
// 方法重载
// 一个类，多个方法名称相同，但是形参列表不同,修饰符、返回值是否一样无所谓
// 形参列表不同指的是 形参的个数、类型、顺序不同，不关心形参的名称
public class MethodOverLoadDemo1 {
    public static void main(String[] args) {
        test();
        test(1);
        test(1.1);
        // test(1,2);
    }
    public static void test(){
        System.out.println("===test1===");
    }
    public static void test(int a){
        System.out.println("===test2==="+a);
    }
    public static void test(double a){
        System.out.println("===test3==="+a);
    }
    int test(int a,int b){
        return a+b;
    }
}
