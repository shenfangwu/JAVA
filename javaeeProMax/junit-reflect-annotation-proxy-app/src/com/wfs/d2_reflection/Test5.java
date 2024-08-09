package com.wfs.d2_reflection;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

/**
 * 绕过编译阶段为集合添加数据
 * 反射案例：给你任意一个对象，在不清楚对象字段的情况可以，可以把对象的字段名称和对应值存储到文件中去。
 */
public class Test5 {
    public static void main(String[] args) throws Exception {
        Student s = new Student();
        getData(s);
    }
    // 1 定义一个方法，可以接收任意类的对象
    public static void getData(Object o) throws Exception {
        OutputStream os = new FileOutputStream("junit-reflect-annotation-proxy-app\\src\\Output.txt");
        PrintStream ps = new PrintStream(os);
        Class c = o.getClass();
        // 2 每次收到一个对象后，需要解析这个对象的全部成员变量名称。
        Field[] fields = c.getDeclaredFields();
        // 3 遍历成员变量信息，然后提取本成员变量在对象中的具体值
        for (Field field : fields) {
            // 4 存入成员变量名称和值到文件中去即可。
            ps.println(field.getName()+"="+field.get(o));
        }
    }
}
