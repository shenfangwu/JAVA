package com.wfs.d5_generics_class;

/**
 * 泛型类
 */
public class Test {
    public static void main(String[] args) {
        // 1 泛型类
        MyClassArray<String> myClassArray = new MyClassArray<>();
        myClassArray.add("hangdanyuan");
        myClassArray.add("101");
        myClassArray.add("wfs");
        myClassArray.show();

    }
}
