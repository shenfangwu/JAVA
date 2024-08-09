package com.wfs.d2_reflection;

import org.junit.Test;

import java.lang.reflect.Constructor;

/**
 * 获取构造器并对其进行操作
 * 返回单个构造器对象（只能拿public的）
 * 返回单个构造器对象，存在就能拿到
 */
public class Test1 {

    @Test
    public  void testGetConstructors() throws Exception {
        Class c = Student.class;
        // 1 获取返回所有构造器对象的数组（只能拿public的）
        Constructor[] constructors1 = c.getConstructors();
        for (int i = 0; i < constructors1.length; i++) {
            System.out.println(constructors1[i]+"--->"+constructors1[i].getParameterCount());
        }
        // 2 获取返回所有构造器对象的数组,存在就可以拿到
        Constructor[] constructors2 = c.getDeclaredConstructors();
        for (int i = 0; i < constructors2.length; i++) {
            System.out.println(constructors2[i]+"--->"+constructors2[i].getParameterCount());
        }
    }
    @Test
    public  void testGetConstructor() throws Exception {
        Class c = Student.class;
        // 3 返回单个构造器对象（只能拿public的）
        Constructor constructor1 = c.getConstructor();
        System.out.println(constructor1.getName()+"--->"+constructor1.getParameterCount());
        // 4 返回单个构造器，存在就可拿到
        Constructor constructors2 = c.getDeclaredConstructor(String.class,int.class,double.class);
        System.out.println(constructors2.getName()+"--->"+constructors2.getParameterCount());
    }
}
