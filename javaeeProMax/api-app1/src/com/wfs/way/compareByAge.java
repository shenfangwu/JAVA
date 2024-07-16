package com.wfs.way;

public class compareByAge {
    public static int compare(Student o1,Student o2){
        return o1.getAge()-o2.getAge();// 升序
    }
    public int compareDesc(Student o1,Student o2){
        return  o2.getAge()-o1.getAge();// 降序
    }
}
