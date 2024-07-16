package com.wfs.d7_interface;

public class C implements A,B{
    @Override
    public void testA() {
        System.out.println("实现了接口A");
    }
    public void testB() {
        System.out.println("实现了接口B");
    }
}
