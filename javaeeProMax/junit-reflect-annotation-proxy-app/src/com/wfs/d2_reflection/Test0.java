package com.wfs.d2_reflection;


/**
 * 反射是在运行时获取类的字节码文件对象：然后可以解析类中的全部成分
 * 反射的第一步：获取Class类的对象
 */
public class Test0 {
    public static void main(String[] args) throws Exception {
        // 1 类名.class
        Class c1 = Student.class;
        System.out.println(c1.getName());// 全类名
        System.out.println(c1.getSimpleName());// 简名
        // 2 Class类中的静态方法
        Class c2 = Class.forName("com.wfs.d2_reflection.Student");
        System.out.println(c1 == c2);
        // 3 对象.getClass
        Student s = new Student();
        Class c3 = s.getClass();
        System.out.println(c3 == c2);
    }
}
