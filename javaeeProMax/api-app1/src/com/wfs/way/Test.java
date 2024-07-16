package com.wfs.way;

import java.util.Arrays;

/**
 * 方法引用:简化lambda表达式
 */
public class Test {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("wfs", 100, 19);
        students[1] = new Student("jsc", 50, 14);
        students[2] = new Student("wyb", 80, 13);
        // 0 lambda简化写法
        // Arrays.sort(students,(s1,s2)->s1.getAge()-s2.getAge());
        // System.out.println(Arrays.toString(students));
        // 1 静态方法的引用
        // 若某个Lambda表达式中只是调用一个静态方法，并且前参数的形式一致，就可以使用静态方法引用
        Arrays.sort(students,compareByAge::compare);
        System.out.println(Arrays.toString(students));
        // 2 实例方法的引用
        // 若某个lambda表达式里只有调用一个实例方法，并且前后参数的形式一致，就可使用实例方法的引用
        compareByAge c = new compareByAge();
        Arrays.sort(students,c::compareDesc);
        System.out.println(Arrays.toString(students));
        // 3 特定类型的方法引用
        // 若某个lambda表达式只是调用一个实例方法，且前面的参数列表中的第一个参数是作为方法的主调
        // 后面的所有参数都是作为该实例方法的入参的，则此时就可以使用特定类型的方法引用
        String[] strings = {"wfs","Wd","jsc","rgj"};
        Arrays.sort(strings,String::compareToIgnoreCase);
        System.out.println(Arrays.toString(strings));
    }
}
