package com.wfs.d8_generics_attention;

import java.util.ArrayList;

/**
 * 泛型的几点注意事项
 */
public class Test {
    public static void main(String[] args) {
        // 1 泛型是工作在编译阶段的，一旦程序编译成class文件，class文件就不存在泛型了，这就是泛型擦除
        // 2 泛型不支持基本数据类型，只能支持对象类型（引用类型）
        // ArrayList<int> arrayList = new ArrayList<int>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
    }
}
