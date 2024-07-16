package com.wfs.loop;

/**
 * do-while循环语句
 */
public class DoWhileDemo6 {
    public static void main(String[] args) {
        // do-while是先执行后判断
        // for的循环变量只能在循环中使用，而其他循环可以在之后也能使用
        do{
            System.out.println("hello");
        }while(false);// 只执行一次
    }
}
