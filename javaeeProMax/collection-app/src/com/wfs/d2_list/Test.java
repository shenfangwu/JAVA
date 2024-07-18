package com.wfs.d2_list;

import java.util.ArrayList;
import java.util.List;

/**
 * List集合
 * List集合支持索引，所以多很多与索引相关的方法，
 * 当然Collection的功能List也继承了
 */
public class Test {
    public static void main(String[] args) {
        // 1 创建一个ArrayList集合对象（有序、可重复、有索引）
        List<String> list = new ArrayList<>();
        list.add("蜘蛛精");
        list.add("至尊宝");
        list.add("唐僧");
        System.out.println(list);
        // 2 add在某个索引位置插入元素
        list.add(2,"紫霞仙子");
        System.out.println(list);
        // 3 remove根据索引删除元素，返回删除元素
        System.out.println(list.remove(2));
        System.out.println(list);
        // 4 get返回集合中指定位置的元素
        System.out.println(list.get(1));
        // 5 set修改索引位置的元素，修改成功后返回原来的数据
        System.out.println(list.set(2,"wfs"));
    }
}
