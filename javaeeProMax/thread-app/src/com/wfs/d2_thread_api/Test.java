package com.wfs.d2_thread_api;
/**
 * Thread提供的常用方法
 */
public class Test {
    public static void main(String[] args) throws Exception{
        MyThread myThread = new MyThread();
        // 2 启动线程
        myThread.start();
        // 6 myThread.join(); 让当前调用这个方法的线程先执行完
        // 3 获取当前线程的名称
        System.out.println(myThread.getName());
        // 4 为线程设置名称
        myThread.setName("test-thread");
        System.out.println(myThread.getName());
        // 5 获取当前执行的线程对象
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName());


    }
}
