package com.wfs.d6_stream;

import java.util.*;
import java.util.stream.Stream;

/**
 * stream创建
 */
public class StreamTest2 {
    public static void main(String[] args) {
        // 1 获取集合的Stream值
        List<String> names = new ArrayList<>();
        Collections.addAll(names,"张无忌","张三丰","张翠山","赵敏");
        Stream<String> stream = names.stream();
        // 2 获取Set集合的Stream
        Set<String> set = new HashSet<>();
        Collections.addAll(set,"刘德华","张曼玉","蜘蛛精","德玛西亚");
        Stream<String> stream1 = set.stream();
        stream1.filter(s->s.contains("德")).forEach(s-> System.out.println(s));
        // 3 获取Map的stream
        Map<String,Double> map = new HashMap();
        map.put("wfs",180.1);
        map.put("lgc",179.1);
        map.put("jsc",160.1);
        Set<String> strings = map.keySet();
        // 4 获取数组的stream流
        String[] names2 = {"张翠山","东方不败","唐大山"};
        Stream<String> stringStream0 = Arrays.stream(names2);
        Stream<String> stringStream1 = Stream.of(names2);
    }
}
