package com.wfs.d10_stringbuilder;

/**
 * StringBuilder啥时用
 */
public class Test1 {
    public static void main(String[] args) {
        // 1 对于字符串的操作：比如频繁的拼接、修改等使用StringBuilder
        // 2 若操作字符串较少，或者不需要操作 建议使用String
        String str = "";
        // 效率很低
        //for (int i = 0; i < 10000000; i++) {
          //  str += "wfs";
        // }
        StringBuilder myStr = new StringBuilder();
        for (int i = 0; i < 10000000; i++) {
            myStr.append("wfs");
        }
        System.out.println(myStr);
        // 3 StringBuffer与StringBuilder用法一样
        // StringBuffer线程安全 StringBuilder线程不安全
    }
}
