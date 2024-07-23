package com.wfs.d4_map;

import java.util.HashMap;
import java.util.Map;

/**
 * 认识Map
 * 双列集合，每个元素都是键值对，一次需要存储一对数据作为一个元素
 * Map的所有键是不允许重复的，但值可以重复，键和值一一对应，每个键只能找到自己对应的值
 * 适用场景：需要存储一一对应的数据时
 * HashMap LinkedHashMap TreeMap
 */
public class Test {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(0,"wfs");
        map.put(1,"jsc");
        map.put(2,"lgc");
        System.out.println(map);
    }
}
