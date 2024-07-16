package com.wfs.string;

public class stringTest1 {
    public static void main(String[] args) {
        // 1
        String s1 = "abc";// 字符串常量区
        String s2 = "ab";// 字符串常量区
        String s3 = s2 + "c";// 堆区
        System.out.println(s1 == s3);
        // 2
        String s4 = "abc";
        String s5 = "a" + "b" + "c";// 编译器自动优化
        System.out.println(s4 == s5);// true
    }
}
