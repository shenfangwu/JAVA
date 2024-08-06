package com.wfs.d3_safe_thread;

public class ThreadTest {
    public static void main(String[] args) {
        Account acc = new Account(100,"ICBC");
        new DrawThread(acc,"小明").start();
        new DrawThread(acc,"小红").start();
    }
}
