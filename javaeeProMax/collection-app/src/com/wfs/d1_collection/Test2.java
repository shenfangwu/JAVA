package com.wfs.d1_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

/**
 * Collection集合特点
 * List系列：添加的元素是有序、可重复、有索引
 * Set系列：添加的元素是无序、不可重复、无索引(HashSet、LinkedHashSet(有序)、TreeSet（默认升序）)
 */
public class Test2 {
    public static void main(String[] args) {
        // Collection是单列集合的祖宗，它规定的方法是全部单列集合都会继承的
        Collection<String> collection = new ArrayList<>();// 多态
        // 1 add
        collection.add("wfs");
        collection.add("jsc");
        System.out.println(collection);
        // 2 clear 清空集合元素
        // collection.clear();
        System.out.println(collection);
        // 3 remove
        collection.remove("wfs");
        System.out.println(collection);
        // 4 contains
        boolean isexist = collection.contains("wfs");
        System.out.println(isexist);
        // 5 isEmpty
        System.out.println(collection.isEmpty());
        // 6 size
        System.out.println(collection.size());
        // 7 toArray 把集合中的元素，存储到数组中
        Object[] objects= collection.toArray();
        System.out.println(Arrays.toString(objects));
        // 8 addAll
        Collection<String> collection1 = new ArrayList<>();
        Collection<String> collection2 = new ArrayList<>();
        collection1.add("wfs");
        collection1.add("wfs");
        collection1.add("wfs");
        collection2.add("jsc");
        collection2.add("jsc");
        collection2.add("jsc");
        collection1.addAll(collection2);// 2把东西全部导入1中
        System.out.println(collection1);
    }
}
