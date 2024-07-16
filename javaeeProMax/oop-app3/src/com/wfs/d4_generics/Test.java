package com.wfs.d4_generics;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 泛型：定义类、接口、方法时，同时声明一个或者多个类型变量，成为泛型类、接口、方法；统称为泛型
 * 作用：提供了在编译阶段约束所能操作的数据类型，并自动进行检查的能力，避免强制类型转换
 * 本质：把具体的数据类型作为参数传给类型变量
 */
public class Test {
    public static void main(String[] args) {
        // 1 泛型类举例
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("hangdanyuan");
        stringArrayList.add("101");
        stringArrayList.add("wfs");
        for (int i = 0; i < stringArrayList.size(); i++) {
            String str = stringArrayList.get(i);
            System.out.println(str);
        }
    }
}
