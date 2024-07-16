package com.wfs.d2_enum;
/**
 * 抽象枚举：枚举里有抽象方法
 */
public enum B {
    X(){// 类似匿名内部类的写法，重写了抽象枚举B的抽象函数，成为了一个继承抽象枚举B的一个新枚举类X
        @Override
        public void test() {
            System.out.println("X");
        }
    },
    Y(){
        @Override
        public void test() {
            System.out.println("Y");
        }
    },Z(){
        @Override
        public void test() {
            System.out.println("Z");
        }
    };
    public abstract void test();
}
