package com.wfs.d3_annotation;

import java.lang.reflect.Method;

/**
 * 模拟Junit框架
 * 需求
 * 定义若干个方法，只要加了MyTest注解，就可以在启动时被触发执行
 * 分析
 * 定义一个自定义注解MyTest，只能注解方法，存活范围是一直都在。
 * 定义若干个方法，只要有@MyTest注解的方法就能在启动时被触发执行，没有这个注解的方法不能执行。
 */
public class Test {
    public void test1(){
        System.out.println("---test1---");
    }
    @MyTest
    public void test2(){
        System.out.println("---test2---");
    }
    public void test3(){
        System.out.println("---test3---");
    }
    @MyTest
    public void test4(){
        System.out.println("---test4---");
    }
    public static void main(String[] args) throws Exception {
        Test test = new Test();
        Class c = Test.class;
        // 1获取所有成员方法
        Method[] methods= c.getDeclaredMethods();
        for (Method method : methods) {
            // 2注解的解析：判断当前对象是否使用了指定的注解，如果使用了则返回true，否则false
            if(method.isAnnotationPresent(MyTest.class)){
                // 3执行方法
                method.invoke(test);
            }
        }
    }
}
