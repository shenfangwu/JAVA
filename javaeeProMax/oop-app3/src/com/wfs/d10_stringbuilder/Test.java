package com.wfs.d10_stringbuilder;

/**
 * StringBuilder代表可变字符串对象，相当于一个容器，里面装的字符串也是可以改变的，就是用来操作字符串的
 * 好处：比String更适合做字符串的修改操作，效率会更高，代码更简洁
 */
public class Test {
    public static void main(String[] args) {
        // 1 创建
        StringBuilder sb0 = new StringBuilder();
        StringBuilder sb1 = new StringBuilder("test");
        // 2 方法
        // 2-1 添加数据 append(任意类型)返回的是this
        sb0.append("hang").append("dan").append("yuan").append(101).append('w').append('f').append('s');
        System.out.println(sb0);
        // 2-2 reverse 反转
        sb1 = sb0.reverse();
        System.out.println(sb1);
        // 2-3 length 长度
        System.out.println(sb1.length());
        // 2-4 toString 返回一个String类型
        sb1.toString();
        System.out.println(sb1.getClass());
    }
}
