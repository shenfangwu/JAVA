package com.wfs.d1_createthread;
public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("线程执行");
        }
    }
}
