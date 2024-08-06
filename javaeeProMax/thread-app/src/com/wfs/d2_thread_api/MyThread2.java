package com.wfs.d2_thread_api;

public class MyThread2 {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 5; i++) {
            if(i == 3){
                // 让当前执行的线程休眠多少毫秒后，再继续执行
                Thread.sleep(5000);
            }
            System.out.println("Test");
        }
    }
}
