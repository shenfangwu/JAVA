package com.wfs.d2_reflection;

import org.junit.Test;

import java.lang.reflect.Constructor;

/**
 * 使用反射技术获取构造器对象并使用
 */
public class Test2 {
    @Test
    public  void testGetConstructor() throws Exception {
        Class c = Student.class;
        // 返回单个构造器，存在就可拿到
        Constructor constructors2 = c.getDeclaredConstructor(String.class,int.class,double.class);
        System.out.println(constructors2.getName()+"--->"+constructors2.getParameterCount());
        // 根据指定的构造器创建对象并使用
        Student student = (Student) constructors2.newInstance("wfs",25,100);
        System.out.println(student);
    }
}
