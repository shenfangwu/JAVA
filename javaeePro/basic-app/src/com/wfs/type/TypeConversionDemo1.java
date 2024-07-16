package com.wfs.type;

/**
 * 类型自动转换
 */
public class TypeConversionDemo1 {
    public static void main(String[] args) {
        // 类型范围小的变量可直接赋值给类型范围大的变量
        byte a = 12;
        int b = a;
        System.out.println(a);
        System.out.println(b);
        // byte -> short||char -> int||float -> long||double
        // 注意 short不可以自动转换char因为这两个内存大小相同
        int c = 100;
        double d = c;System.out.println(d);
        float f = a; System.out.println(f);
        char r = 'a';
        f =  r;System.out.println(f);
    }
}
