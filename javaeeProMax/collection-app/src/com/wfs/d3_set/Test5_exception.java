package com.wfs.d3_set;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 集合的并发修改异常
 * 使用迭代器遍历集合时，又同时在删除集合中的数据，程序就会出现并发修改异常的错误
 * 由于增强for循环遍历集合就是迭代器遍历集合的简化写法，因此使用增强for遍历循环集合，又在同时删除集合中的数据，程序也会出现并发修改异常的错误
 */
public class Test5_exception {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        // 解决方法1 使用迭代器本身的删除方法删除数据即可
        Iterator<Integer> lt = arrayList.iterator();
        while(lt.hasNext()){
            if(lt.next() == 2)
            lt.remove();// 删除元素 自带--操作
        }
        System.out.println(arrayList);
        // 解决方法2 for循环---倒着遍历   -----从前到后遍历时 删除元素同时i--
    }
}
