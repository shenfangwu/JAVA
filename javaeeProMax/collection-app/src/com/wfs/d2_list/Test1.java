package com.wfs.d2_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/**
 * List的遍历方式
 * for 增强for lambda 迭代器
 */
public class Test1 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("蜘蛛精");
        list.add("至尊宝");
        list.add("唐僧");
        // 有了索引就支持普通for了
        // 1 for

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println("普通for");
        // 2 增强for

        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.print(s + " ");
            }
        });
        System.out.println("增强for");
        // 3 lambda

        list.forEach(s -> System.out.print(s + " "));
        System.out.println("lambda");
        // 4 迭代器

        Iterator<String> lt = list.iterator();
        while (lt.hasNext()) {
            System.out.print(lt.next() + " ");
        }
        System.out.println("lterator");
    }
}
