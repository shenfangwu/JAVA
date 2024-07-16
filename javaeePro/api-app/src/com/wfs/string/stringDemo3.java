package com.wfs.string;
// sring使用的注意事项
public class stringDemo3 {
    public static void main(String[] args) {
        // 1 String对象的内容不可改变，被称为不可变字符串对象。
        String name = "wfs";//
        name += "hangdanyuan";
        name += "101";
        System.out.println(name);
        // 2 只要是以“...”方式写出的字符串对象，会存储到字符串常量池，且相同内容的字符串只存储一份；
        String s1 = "wfs";
        String s2 = "wfs";
        System.out.println(s1 == s2);
        // 3 通过new方式创建字符串对象，每new一次都会产生一个新的对象放在堆内存中。
        char[] chars = {'a','b','c'};
        String a1 = new String(chars);
        String a2 = new String(chars);
        System.out.println(a1 == a2);

    }
}
