package com.wfs.d5_collection_nesting;

import java.util.*;

/**
 * 集合的嵌套
 */
public class Test {
    public static void main(String[] args) {
        // 1 定义集合存储全部省份信息，和对应城市信息
        Map<String, List<String>> map = new HashMap<>();
        List<String> cities1 = new ArrayList<>();
        Collections.addAll(cities1,"锦州市","沈阳市","营口市","大连市","葫芦岛市");
        map.put("辽宁省",cities1);
        System.out.println(map);
        List<String> cities2 = new ArrayList<>();
        Collections.addAll(cities2,"哈尔滨市","黑河市","佳木斯市","鹤岗市");
        map.put("黑龙江省",cities2);
        System.out.println(map);
        // 2 遍历集合
        List<String> cities = map.get("辽宁省");
        for (String city : cities) {
            System.out.print(city+" ");
        }
        map.forEach((p,c)->{
            System.out.println(p+"--------->"+c);
        });
    }
}
