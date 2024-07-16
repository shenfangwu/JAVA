package com.wfs.lambda;

/**
 * Lambda的省略写法
 * 1 参数类型可以省略不写
 * 2 若只有一个参数，参数类型可以省略，同时()也可以省略
 * 3 若Lambda表达式中的方法体只有一行代码，可以省略大括号不写，同时省略分号，
 *   此时，若这行代码是return语句，也必须去掉return不写
 */
public class Test1 {
    public static void main(String[] args) {
        Car car = ()-> System.out.println("简单化跑步！！！");
        car.Run();
    }
}
