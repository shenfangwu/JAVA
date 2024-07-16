package com.wfs.lambda;
/**
 * Lambda表达式：用于简化匿名内部类的代码写法
 * 注意：lambda表达式只能简化函数式接口的匿名内部类
 * 函数式接口：1有且仅有一个抽象方法的接口 2有@Functionallinterface的注解的一般都是函数式接口
 */
public class Test {
    public static void main(String[] args) {
      Car car = ()->{
              System.out.println("跑步");
        };
      car.Run();
    }
}
