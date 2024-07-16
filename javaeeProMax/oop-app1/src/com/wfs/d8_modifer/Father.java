package com.wfs.d8_modifer;

public class Father {
    // 在本类中使用
    private void privateMethod(){
        System.out.println("这是私有函数");
    }
    // 在本类中使用、同一包中其他类里
     void Method(){
        System.out.println("这是缺省函数");
    }
    // 在本类中使用、同一包中其他类里、任意包下的子类
    protected void protectedMethod(){
        System.out.println("这是保护函数");
    }
    // 在本类中使用、同一包中其他类里、任意包下的子类、任意包下的任意类
    public void publicMethod(){
        System.out.println("这是公有函数");
    }
    public void test(){
        // 1 在本类中使用
        privateMethod();
    }
}
