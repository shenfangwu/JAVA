package com.wfs.d5_synchronized_lock;

/**
 * lock锁
 */
public class ThreadTest {
    public static void main(String[] args) {
        Account acc = new Account(100,"ICBC");
        new DrawThread(acc,"小明").start();
        new DrawThread(acc,"小红").start();
    }
}
