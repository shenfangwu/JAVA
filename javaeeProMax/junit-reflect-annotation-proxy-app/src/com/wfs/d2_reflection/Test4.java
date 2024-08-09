package com.wfs.d2_reflection;

import org.junit.Test;

import java.lang.reflect.Method;

/**
 * 获取成员方法的作用依然是在某个对象中进行执行此方法
 */
public class Test4 {
    @Test
    public void testWay() throws Exception {
        Class c = Student.class;
        // 获取所有成员方法
        Method[] methods = c.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName()+"-->"+method.getParameterCount()+"--->"+method.getReturnType());
        }
        // 获取某个成员方法对象
        Method run = c.getDeclaredMethod("run");
        System.out.println(run.getName()+"--->"+run.getParameterCount()+"--->"+run.getReturnType());
        // 执行方法
        Student s = new Student();
        run.invoke(s);
    }
}
