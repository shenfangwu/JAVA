package com.wfs.d5_generics_class;

public class MyClassArray<E> {
    private Object[] arr = new Object[10];
    private int size;
    public boolean add(E e){
        arr[size++] = e;
        return true;
    }
    public void show(){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
