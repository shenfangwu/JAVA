package com.wfs.d7_generics_method;

import java.util.ArrayList;

/**
 * 泛型方法
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<Bmw> bmws= new ArrayList<>();
        bmws.add(new Bmw());
        bmws.add(new Bmw());
        ArrayList<Bc> bcs= new ArrayList<>();
        bcs.add(new Bc());
        bcs.add(new Bc());
        go(bcs);
        go(bmws);
    }
    public static <T> void test(T t){
        T s = t;
        System.out.println(s);
    }
   // public static <T> void go(ArrayList<T> cars){
//
   // }

    // ?是通配符，可以在“使用泛型”的时候代表一切类型
    // 泛型上限：? extends Car : ?能接收的必须是Car或者其子类
    // 泛型下限：? super Car : ?能接收的必须是Car或者其父类
   public static void go(ArrayList<?> cars){

       }
}
