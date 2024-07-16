package com.wfs.string;
// string的API
public class stringDemo2 {
    public static void main(String[] args) {
        // 1 字符串长度
        String str = "hangdanyuan101wfs";
        System.out.println(str.length());
        // 2 提取字符串中某个索引位置处的字符
        char c = str.charAt(1);
        System.out.println(c);
        // 字符串遍历
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.print(ch+" ");
        }
        // 3 把字符串转换成字符数组，再进行遍历
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
        // 4 判断字符串内容
        String s1 = new String("wfs");
        String s2 = new String("wfs");
        System.out.println(s1 == s2);// false
        System.out.println(s1.equals(s2));// true
        // 5 忽略大小比较字符串内容
        String s3 = new String("WFS");;
        System.out.println(s1.equalsIgnoreCase(s2));// true
        // 6 截取字符串内容
        String s4 = "helloworld!";
        String rs = s4.substring(0,5);
        System.out.println(rs);
        // 7 从当前索引位置一直截取到字符串末尾
        String rs2 = s4.substring(5);
        System.out.println(rs2);
        // 8 把字符串中的某个内容换成新内容，并返回新的字符串对象
        String info = "qwe,wocaonima";
        String rs3 = info.replace("wocaonima","********");
        System.out.println(rs3);
        // 9 判断字符串中是否包含某个关键字
        String info2 = "javanoffnqfnqefeqfjavainfenf";
        System.out.println(info2.contains(info2));
        // 10 判断字符串是否以某个字符串开头
        String rs4 = "夜白衣";
        System.out.println(rs4.startsWith("夜"));
    }
}
