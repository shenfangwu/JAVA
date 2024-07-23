package com.wfs.d4_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Map的遍历方式
 * 1 键找值
 * 2 键值对
 * 3 Lambda
 */
public class Test2 {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();
        map.put("蜘蛛精1", 162.3);
        map.put("蜘蛛精2", 1623.3);
        map.put("蜘蛛精3", 163.3);
        map.put("蜘蛛精4", 161.3);
        map.put("蜘蛛精5", 164.3);
        // 1 键找值
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            double val = map.get(key);
            System.out.println(val);
        }
        // 2 键值对 entrtSet 获取所有“键值对”的集合
        Set<Map.Entry<String, Double>> entries = map.entrySet();
        for (Map.Entry<String, Double> entry : entries) {
            String key = entry.getKey();
            double value = entry.getValue();
            System.out.println(key + "---->" + value);
        }
        // 3 lambda
        map.forEach((k,v)->{
            System.out.println(k+"--->"+v);
        });
    }
}
