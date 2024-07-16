package com.wfs.arraylist;

import java.util.ArrayList;

// 学习集合以及集合中的arraylist
// 集合是一种容器用于存储数据，集合的大小可变
public class arrayListDemo1 {
    public static void main(String[] args) {
        // 1 ArraylList是泛型类，可以约束存储的数据类型
        // 创建对象，调用无参数构造器初始化对象
        // 了解集合的相关增删改查方法
        ArrayList<String> list = new ArrayList<>();
        list.add("航弹院");
        list.add("101分厂");
        list.add("wfs");
        System.out.println(list);
        // 2 往集合中的某个索引位置添加一个数据
        list.add(3,"jsc");
        System.out.println(list);
        // 3 根据索引获取集合中的某个索引位置的值
        System.out.println(list.get(0));
        // 4 获取集合大小
        System.out.println(list.size());
        // 5 根据索引删除集合的某个元素值，返回被删除的值
        System.out.println(list.remove(3));
        System.out.println(list);
        // 6 直接删除某个元素值，返回BOOLEAN
        System.out.println(list.remove("wfs"));
        System.out.println(list);
    }
}
