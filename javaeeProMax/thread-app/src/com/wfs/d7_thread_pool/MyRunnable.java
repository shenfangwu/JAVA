package com.wfs.d7_thread_pool;

/**
 * 使用线程池处理Runnable任务
 */
public class MyRunnable implements Runnable{

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName()+"执行----");
            Thread.sleep(Integer.MAX_VALUE);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
