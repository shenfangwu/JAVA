package com.wfs.d1_createthread;

/**
 * 使用Runnable接口实现多线程
 * 优点：任务类只是实现接口，可以继续继承其他类、实现其他接口，扩展性强。
 * 缺点：需要多一个Runnable对象。
 */
public class create_thread_test2 {
    public static void main(String[] args) {
        // 将Runnable对象交给Thread处理
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程执行！！");
            }
        }).start();
        System.out.println("主线程");
    }
}
