package com.wfs.d2_regex;

import java.awt.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 使用正则表达式查找一段文本中的内容
 */
public class Test2 {
    public static void main(String[] args) {
        String data = "来黑马程序员学习JAVA。\n" +
                "电话：19704028051\n" + "座机电话：01036517895，010-9851256\n" +
                "邮箱：a15524318802@163.com" +
                "热线电话：400-618-9090，400-618-4000，4006184000";
        // 1 定义爬取规则
        String regex = "(\\w{1,}@\\w{2,10}(\\.\\w{2,10}){1,2})|"+
                "(1[3-9]\\d{9})|(0\\d{2,5}-?\\d{5,15})|400-?\\d{3,8}-?\\d{3,8}";
        // 2 把正则表达式封装在一个Pattern对象
        Pattern pattern = Pattern.compile(regex);
        // 3 通过pattern对象得到查找内容的匹配器
        Matcher matcher = pattern.matcher(data);
        // 4 通过匹配器开始去内容中查找信息
        while (matcher.find()){
            System.out.println(matcher.group());// 取出匹配到的信息
        }
    }
}
