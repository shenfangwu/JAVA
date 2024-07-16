package com.wfs.string;
// 学习string
public class stringDemo1 {
    public static void main(String[] args) {
        // 1
        String name = "wfs";
        System.out.println(name);
        // 2
        String str1 = new String("wfs");
        System.out.println(str1);
        // 3
        char[] chars = {'a','w'};
        String str2 = new String(chars);
        System.out.println(str2);
        // 4
        byte[] bytes = {97,98,99};
        String str3 = new String(bytes);
        System.out.println(str3);
    }
}
