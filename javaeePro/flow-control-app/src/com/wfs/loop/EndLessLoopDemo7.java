package com.wfs.loop;

/**
 * 死循环
 */
public class EndLessLoopDemo7 {
    public static void main(String[] args) {
        // 死循环用于做服务器程序
        // 死循环的3种写法
        // 1
        //for(;;){
         //    System.out.println("hello");
       // }
        // 2 经典
        //while(true){
         //   System.out.println("hello");
       // }
        // 3
        do{
            System.out.println("hello");
        }while(true);
    }
}
