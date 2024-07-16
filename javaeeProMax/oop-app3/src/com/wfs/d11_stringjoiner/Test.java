package com.wfs.d11_stringjoiner;

import java.util.StringJoiner;

/**
 * Stringjoiner是JDK8开始有的，跟StringBuffer一样，也是用来操作字符串的，也可以看成一个容器，创建之后里面的内容是可变的
 * 好处：不仅提高字符串的操作效率，并且在有些场景使用它操作字符串，代码会更简洁
 */
public class Test {
    public static void main(String[] args) {
        String str = showIntArr(new int[]{1,2,3,4,5});
        System.out.println(str);
    }
    public static String showIntArr(int[]arr){
        if(arr == null){
            return null;
        }
        StringJoiner sj = new StringJoiner(",","[","]");
        for (int i = 0; i < arr.length; i++) {
            sj.add(arr[i]+"");// 需要字符串：+“”
        }
        return sj.toString();
    }
}
