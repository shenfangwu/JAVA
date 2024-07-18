package com.wfs.d2_list;

import java.util.LinkedList;

/**
 * LinkedList
 */
public class Test_LinkedList {
    public static void main(String[] args) {
        // 1 LinkedList新增了很多首尾操作的特有方法
        // addFirst addLast getFirst getLast removeFirst removeLast
        // 2 底层原理：基于双链表实现=》查询慢、增删较快、首尾元素增删改查极快！！！
        // 3 适用场景：经常对首尾元素操作的场景！
        // 3.1 模拟队列:先进先出
        System.out.println("模拟队列-----------------");
        LinkedList<String> stringLinkedList = new LinkedList<>();
        stringLinkedList.addLast("第1位顾客");
        stringLinkedList.addLast("第2位顾客");
        stringLinkedList.addLast("第3位顾客");
        stringLinkedList.addLast("第4位顾客");
        System.out.println(stringLinkedList);
        stringLinkedList.removeFirst();
        stringLinkedList.removeFirst();
        System.out.println(stringLinkedList);
        // 3.2 模拟栈：先进后出
        System.out.println("模拟栈------------------");
        LinkedList<String> stringLinkedList1 = new LinkedList<>();
        stringLinkedList1.addFirst("第1发子弹");
        stringLinkedList1.addFirst("第2发子弹");
        stringLinkedList1.addFirst("第3发子弹");
        stringLinkedList1.addFirst("第4发子弹");
        System.out.println(stringLinkedList1);
        stringLinkedList1.removeFirst();
        stringLinkedList1.removeFirst();
        System.out.println(stringLinkedList1);
    }
}
