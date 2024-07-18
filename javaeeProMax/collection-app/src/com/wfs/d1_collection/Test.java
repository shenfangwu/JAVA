package com.wfs.d1_collection;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * 集合：集合是一种容器，装数据的，类似数组，但集合大小可变，开发常用
 * 分为Collection单列集合:每个元素只包含一个值
 * Map代表双列集合，每个元素包含两个值（键值对）
 */
public class Test {
    public static void main(String[] args) {
        // 1 Collection代表单列集合，每个元素只包含一个值
        // 分为list和set
        ArrayList<String> list = new ArrayList<>();
        list.add("java1");
        list.add("java2");
        list.add("java3");
        System.out.println(list);

        HashSet<String> set = new HashSet<>();
        set.add("java1");
        set.add("java3");
        set.add("java2");
        set.add("java1");
        set.add("java2");
        System.out.println(set);
    }
}
