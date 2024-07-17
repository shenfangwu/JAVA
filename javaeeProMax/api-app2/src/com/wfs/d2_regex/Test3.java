package com.wfs.d2_regex;

import java.util.Arrays;

/**
 * 正则表达式去做搜索替换、内容分割
 */
public class Test3 {
    public static void main(String[] args) {
        // 1 替换
        String s1 = "hangdanyuan*******101*****wfs******";
        System.out.println(s1.replaceAll("\\W+",""));
        // 2 (.)\1+ 连续重复的字符 替换 第一个捕获的字符
        String s2 = "我我我我我我喜欢欢欢你你你你你";
        System.out.println(s2.replaceAll("(.)\\1+","$1"));
        // 3 分割 按照正则表达式匹配的内容进行分割字符串，返回一个字符串
        String s3 = "hangdanyuan*******101*****wfs******";
        System.out.println(Arrays.toString(s3.split("\\W+")));

    }
}
