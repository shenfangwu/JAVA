package com.wfs.returndemo;
// return;在无返回值方法中可以立刻跳出所在方法的执行
public class ReturnDemo {
    public static void main(String[] args) {

    }
    public static void test(){
        if(1==2)
        return;
        System.out.println("return");
    }
}
