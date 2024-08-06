package com.wfs.d6_thread_communicate;

import javax.xml.namespace.QName;

/**
 * 线程通信:当多个线程共同操作共享的资源时，线程间通过某种方式互相告知自己的状态，以相互协调，并避免无效的资源争夺
 * wait():让当前线程等待并释放所占锁，直到另一个线程调用notify()方法或 notifyAll()方法
 * notifyAll()：唤醒正在等待的所有线程
 * 生产者-消费者模型
 * 1生产者线程负责生产数据
 * 2消费者线程负责消费生产者生产的数据。
 * 3注意：生产者生产完数据应该等待自己，通知消费者消费；消费者消费完数据也应该等待自己，再通知生产者生产！
 */
public class Test {
    public static void main(String[] args) {
        Desk desk = new Desk();
        // 创建3个生产者
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    desk.put("生产者1");
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    desk.put("生产者2");
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    desk.put("生产者3");
                }
            }
        }).start();
        // 创建2个消费者
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    desk.get("消费者1");
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    desk.get("消费者2");
                }
            }
        }).start();
    }
}
