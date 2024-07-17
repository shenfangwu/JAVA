package com.wfs.d2_regex;

/**
 * 正则表达式初体验
 * 作用1：校验数据格式是否合法
 * 作用2：在一段文本中查找满足要求的内容
 */
public class Test0 {
    public static void main(String[] args) {
        // 1 自己写逻辑判断
        System.out.println(checkQQ(null));
        System.out.println(checkQQ("1497496786"));
        System.out.println(checkQQ("14974967a86"));
        // 2 正则表达式
        System.out.println(regexCheckQQ(null));
        System.out.println(regexCheckQQ("1234567"));

    }
    public static boolean regexCheckQQ(String qq){
        return qq != null && qq.matches("[1-9]\\d{5,19}") ;
    }
    public static boolean checkQQ(String qq){
        // 1 qq是否为null，长度在6-20之间
        if(qq == null || qq.startsWith("0") || qq.length() < 6 || qq.length() >20){
            return false;
        }
        // 2
        for (int i = 0; i < qq.length(); i++) {
            // 根据索引提取到当前位置处的字符
            char ch = qq.charAt(i);
            // 判断ch记住的字符，若不是数字，qq号不合法
            if(ch < '0' || ch > '9'){
                return false;
            }
        }
        return true;
    }
}
