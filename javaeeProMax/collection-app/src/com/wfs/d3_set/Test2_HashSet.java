package com.wfs.d3_set;

import java.util.HashSet;

/**
 * hashSet集合的底层原理
 */
public class Test2_HashSet {
    public static void main(String[] args) {
        // 1 JDK8之前HashSet集合的底层原理，基于哈希表：数组+链表
        // 1.1默认创建长度16的数组，默认加载因子0.75 数组名table
        // 1.2使用元素的哈希值对数组的长度求余计算出应存入的位置
        // 1.3判断当前位置是否为null，若是null直接存入
        // 1.4若不是null，表示有元素，则调用equals方法比较；相等则不存，不等则存入
        // JDK8以前 新元素存入数组，占老元素位置，老元素依靠链表挂在下面
        // 之后，新元素直接挂在老元素下面

        // 2 因此 无序（根据hash存入肯定无序） 不重复（equals函数判断是否重复，重复不会存入，因此不重复） 无索引（无序的话 所以无索引 没意义）
        // 3 若想hashSet对于不同对象，但是存储数据相同的；判定为重复的话=》则需要重写equals和hashcode
        HashSet<Student> hashSet = new HashSet<>();
        hashSet.add(new Student("wfs",26));
        hashSet.add(new Student("wfs",26));
        System.out.println(hashSet);
    }
}
