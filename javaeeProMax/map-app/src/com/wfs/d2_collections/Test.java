package com.wfs.d2_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Collections类是一个操作集合的工具类
 */
public class Test {
    public static void main(String[] args) {
        // 1 addAll 集合批量加元素
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList,"wfs","jsc","lgc","101");
        System.out.println(arrayList);
        // 2 shuffle 打乱list集合中的元素集合
        Collections.shuffle(arrayList);
        System.out.println(arrayList);
        // 3 对list集合中的元素进行升序排序
        Collections.sort(arrayList);
        System.out.println(arrayList);
        // 4 按照自定义规则排序
        Collections.sort(arrayList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });
        System.out.println(arrayList);
    }
}
