package com.wfs.d9_api;

/**
 * Object类：是类层次结构的根，每个类都有Object作为超类
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student0 = new Student("wfs",90);
        Student student1 = new Student("wfs",90);
        // 1 toString默认是返回当前对象在堆内存中的地址信息:类的全类名@十六进制哈希值
        System.out.println(student1);
        // 2 默认是比较当前对象与另一个对象的地址是否相同
        // 相同返回true，不同返回false
        System.out.println(student0.equals(student1));
        // 3 clone:对象克隆,默认是浅克隆
        // 3.1 浅克隆：浅拷贝创建一个新的对象，然后将原对象的字段值复制到新对象中。
        // 如果字段是基本数据类型，那么直接复制其值；如果字段是引用类型，那么复制的是引用，而不是引用的对象。因此，原对象和新对象的引用字段会指向同一个对象。
        // 3.2 深克隆：对象中基本类型的数据直接拷贝、字符串数据拷贝的是地址、其他对象会创建新对象
        User user0 = new User("wfs","123", new int[]{1, 2, 3});
        User user1= (User) user0.clone();
        System.out.println(user1.getName());
        System.out.println(user1.getPassword());
        System.out.println(user1.getCodes());
        System.out.println(user0.getName());
        System.out.println(user0.getPassword());
        System.out.println(user0.getCodes());
    }
}
