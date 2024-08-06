package com.wfs.d2_thread_api;
public class MyThread extends Thread{
    // 1 线程的任务方法
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("线程执行");
        }
    }
}
