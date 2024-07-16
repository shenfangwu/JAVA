package com.wfs.d3_static_attention;
/**
 * static的一些注意事项
 */
public class Student {
    static String schoolName;
    double score;
    // 1 类方法中可以直接访问类成员，但是不能访问实例成员
    public static void printHelloWorld(){
        schoolName = "黑马";
        // score = 100; false
    }

    // 2 实例方法既可以访问类成员也可以访问实例成员
    public  void printHelloWorld2(){
        schoolName = "wfs";
        score = 100;
    }
    // 3 实例方法中可以出现this关键字，但是类方法不可以

}
