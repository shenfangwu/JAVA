package com.wfs.d4_map;

import java.util.*;

/**
 * Map的常用方法
 * Map是双列集合的祖宗，它的功能是全部双列集合都可以继承使用
 */
public class Test1 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();// 多态
        // 1 添加/修改元素
        map.put(1,"wfs");
        map.put(1,"sfw");
        map.put(2,"jsc");
        map.put(3,"lgc");
        System.out.println("-----------添加元素--------------");
        System.out.println(map);
        // 2 获取集合大小
        System.out.println("-----------获取集合大小--------------");
        System.out.println(map.size());
        // 3 清空集合
        System.out.println("-----------清空集合--------------");
        // map.clear();
        System.out.println(map);
        // 4 判断集合是否为空
        System.out.println("-----------判断集合是否为空--------------");
        System.out.println(map.isEmpty());
        // 5 根据键值获取对应值
        System.out.println("-----------根据键值获取对应值--------------");
        System.out.println(map.get(3));
        // 6 根据键值删除对应值
        System.out.println("-----------根据键值删除对应值--------------");
        map.remove(3);
        System.out.println(map);
        // 7 判断是否包含某个键
        System.out.println("-----------判断是否包含某个键--------------");
        System.out.println(map.containsKey(2));
        // 8 判断是否包含某值
        System.out.println("-----------判断是否包含某值--------------");
        System.out.println(map.containsKey("wfs"));
        // 9 获取全部键的集合
        System.out.println("-----------获取全部键的集合-------------");
        Set<Integer> set = new HashSet<>();
        set = map.keySet();
        System.out.println(set);
        // 10 获取全部值的集合
        System.out.println("-----------获取全部值的集合-------------");
        Collection<String> collections = new ArrayList<>();
        collections = map.values();
        System.out.println(collections);
        // 11 把其他map的数据导入map
        System.out.println("-----------把其他map的数据导入map-------------");
        Map<Integer,String> map2 = new HashMap<>();
        map2.putAll(map);
        System.out.println(map2);
    }
}

