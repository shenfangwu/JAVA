package com.wfs.d1_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

/**
 * Collection的遍历方式
 */
public class Test3 {
    public static void main(String[] args) {
        // 1 迭代器：用来遍历集合的专用方式（数组没有迭代器）
        // Iterator<E>:返回集合中的迭代器对象，该迭代器对象默认指向当前集合的第一个元素
        Collection<String> collection = new ArrayList<>();
        collection.add("wfs");
        collection.add("jsc");
        collection.add("lgc");
        Iterator<String> iterator = collection.iterator();
        // 2 迭代器的两个方法 hasNext next
        // 3 迭代器遍历容器
        while (iterator.hasNext()){// 下一个位置有没有内容
            String str = iterator.next();// 取出当前位置存储的数据
            System.out.println(str);
        }
        // 4 增强for遍历容器-----为啥没普通for呢？ 因为List不支持索引
        // 本质就是迭代器遍历集合的简化写法
        for(String s : collection){
            System.out.println(s);
        }
        // 5 lambda遍历集合
        // 需要使用Collection的forEach方法集合lambda遍历集合

        /* // 函数式接口的匿名内部类可以被lambda简化
        collection.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.print(s+" ");
            }
        });*/
        // lambda简化-》实例方法的引用
        collection.forEach(System.out::print);
    }
}
