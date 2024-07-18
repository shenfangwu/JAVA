package com.wfs.d3_set;

/**
 * 了解hash
 * int类型数值，java每个对象都有一个哈希值
 * 同一对象多次调用hashCode得到的哈希值相同
 * 不同对象 哈希值一般不同，也有可能相同（哈希碰撞
 */
public class Test1_Hash {
    public static void main(String[] args) {
        Student student = new Student("wfs",25);
        Student student1 = new Student("jsc",26);
        Student student2 = new Student("lgc",25);
        System.out.println(student.hashCode());
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());

    }
}
