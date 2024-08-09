package com.wfs.d2_reflection;

import org.junit.Test;

import java.lang.reflect.Field;

/**
 * 使用反射技术获取成员变量对象并使用
 * 获取成员变量的作用依然是在某个对象中取值、赋值
 */
public class Test3 {
    @Test
    public void getFields() throws Exception {
        // 1获取类
        Class c = Class.forName("com.wfs.d2_reflection.Student");
        // 2返回所有成员变量对象的数组（只能拿public的）
        Field[] fields = c.getFields();
        // 3遍历成员变量数组
        for (Field field : fields) {
            System.out.println(field.getName()+"---->"+field.getType());
        }
        // 4 定位某个成员变量
        Field fName = c.getDeclaredField("name");
        System.out.println(fName.getName()+"--->"+fName.getType());
        // 5 赋值
        Student s = new Student();
        fName.set(s,"wfs");
        System.out.println(s);
        // 6 取值
        String name = (String) fName.get(s);
        System.out.println(name);
    }
}
