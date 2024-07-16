package com.wfs.d2_enum;

public enum A {
    // 1 枚举类第一行只能罗列一些名称，这些名称都是常量，并且每个常量记住的都是枚举类的一个对象
    // 2 枚举类的构造器都是私有的（写不写都私有），因此，枚举类对外不能创建对象
    // 3 枚举都是最终类，不可以继承
    X,Y,Z;
    // 4 枚举类中，从第二行开始，可以定义类的其他成员
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
