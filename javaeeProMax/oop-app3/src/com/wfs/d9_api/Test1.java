package com.wfs.d9_api;

import java.util.Objects;

/**
 * Objects类：是工具类，提供了很多操作对象的静态方法
 */
public class Test1 {
    public static void main(String[] args) {
        // 1 equals:先做非空判断，再比较两个对象
        String str1 = "wfs";
        String str2 = "wfs";
        Objects.equals(str2,str1);
        // 2 isNull:判断是否为null，是-true
        String str = null;
        System.out.println(Objects.isNull(str));
        //  3 nonNull:与isNull相反
        System.out.println(Objects.nonNull(str));
    }
}
