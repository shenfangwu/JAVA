package com.wfs.define;
// 方法的其他形式
public class MethodDemo2 {
    public static void main(String[] args) {
        // 1 方法是否需要接收数据 是--定义形参 否--不定义形参
        // 2 方法是否需要返回数据 否--没返回值类型（void)
        printHelloWorld1();
        printHelloWorld2(2);
    }
    public static void printHelloWorld1(){
        for (int i = 0; i < 3; i++) {
            System.out.println("HelloWorld1");
        }
    }
    public static void printHelloWorld2(int num){
        for (int i = 0; i < num; i++) {
            System.out.println("HelloWorld2");
        }
    }
}
