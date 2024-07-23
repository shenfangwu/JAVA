package com.wfs.d6_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 体验Stream流
 * // 需求：获取姓张的且名字是3个字的数据 添加到一个新的集合中
 */
public class StreamTest1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("张良");
        list.add("王二麻子");
        list.add("谢广坤");
        list.add("张三丰");
        list.add("张翠山");
        List<String> newList = new ArrayList<>();
        // 1 普通方法
        list.forEach((v)->{
            if(v.startsWith("张")&&v.length()==3){
                newList.add(v);
            }
        });
        System.out.println(newList);
        // 2 使用stream
        List<String> newList2 = list.stream().filter(s->s.startsWith("张")).filter(a->a.length() == 3)
                .collect(Collectors.toList());
        System.out.println(newList2);
        // 3 stream流使用步骤
        /**
         * 1 获取Stream流
         * 2 调用流的各种方法对数据处理
         * 3 获取处理的结果，遍历、统计、收集到一个新集合中返回
         */
    }
}
