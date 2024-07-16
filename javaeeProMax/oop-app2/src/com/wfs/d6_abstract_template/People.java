package com.wfs.d6_abstract_template;

public abstract class People {
    public final void write(){// 模板方法
        System.out.println("1");
        System.out.println("2");
        System.out.println(writeMain());
        System.out.println("3");
    }
    public  abstract String writeMain();
}
