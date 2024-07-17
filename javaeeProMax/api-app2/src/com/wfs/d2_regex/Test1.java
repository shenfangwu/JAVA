package com.wfs.d2_regex;

/**
 * 正则表达式规则
 */
public class Test1 {
    public static void main(String[] args) {
        // 1 String提供一个匹配正则表达式的方法
        //  判断字符串是否匹配正则表达式，匹配返回true，不匹配返回false
        // 2 字符类：只匹配单个字符
        System.out.println("a".matches("[abc]"));// 只能是 a b c其中之一
        System.out.println("a".matches("^abc"));
        System.out.println("a".matches("[a-zA-Z]"));
        System.out.println("A".matches("a-z[A-H]]"));// a到z 或者 A-H
        System.out.println("d".matches("[a-z&&[def]]"));// a-z与def的交集
        System.out.println("d".matches("[a-z&&[^def]]"));// a-z与除了def
        System.out.println("m".matches("[a-z&&[^m-p]]"));// a-z与除了m-p
        // 3 预定义字符（单个）
        System.out.println("a".matches("."));// . 任何字符
        System.out.println("a".matches("\\d"));// 一个数字
        System.out.println("a".matches("\\D"));// 非数字
        System.out.println("a".matches("\\s"));// 空白字符
        System.out.println("a".matches("\\S"));// 非空白数字
        System.out.println("(".matches("\\w"));// 单词字符
        System.out.println("!".matches("\\W"));// 非单词字符
        // 4 数量词
        System.out.println("aaaa".matches("a?"));// 1或0次
        System.out.println("aaaa".matches("a*"));// 0或多次
        System.out.println("aaaa".matches("a+"));// 一次或多次
        System.out.println("aaaa".matches("a{3}"));// 正好3次
        System.out.println("aaaa".matches("a{3,}"));// 至少3次
        System.out.println("aaaa".matches("a{3,5}"));// 3-5次
    }
}
