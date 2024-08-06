package com.wfs.d4_synchronized_codeAndway;

/**
 * 线程同步：让多个线程实现先后依次访问共享资源，这样就解决了安全问题。
 * （1）同步代码块
 * （2）同步方法
 */
public class ThreadTest {
    public static void main(String[] args) {
        Account acc = new Account(100,"ICBC");
        new DrawThread(acc,"小明").start();
        new DrawThread(acc,"小红").start();
    }
}
