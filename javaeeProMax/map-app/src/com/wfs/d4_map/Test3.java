package com.wfs.d4_map;

import java.util.*;

/**
 * 案例-统计投票人数
 * 某班级80名学生，需秋游活动，班长提供4个景点依次是（A\B\C\D)，
 * 每个学生只选择一个经典，请统计最终哪个经典想去的人最多
 */
public class Test3 {
    public static void main(String[] args) {
        List<String> data = new ArrayList<>();
        String[] places = {"A","B","C","D"};
        Random r = new Random();
        // 1 随机投票
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(4);
            data.add(places[index]);
        }
        // 2 统计结果
        Map<String,Integer> res = new HashMap<>();
        for (String s : data) {
            if(res.containsKey(s)){
                res.put(s,res.get(s)+1);
            }else {
                res.put(s,1);
            }
        }
        System.out.println(res);
    }
}
