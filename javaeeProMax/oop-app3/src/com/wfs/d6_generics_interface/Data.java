package com.wfs.d6_generics_interface;

/**
 * 泛型接口
 * @param <T>
 */
public interface Data <T>{
    public void add(T t);
    public void getByName(T t);
}
