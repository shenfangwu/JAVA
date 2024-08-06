package com.wfs.d8_extends;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 1悲观锁就是我们常说到的锁。对于悲观锁来说，他总是认为每次访问共享资源时会发生冲突，
 * 所以必须每次数据操作加上锁，
 * 以保证临界区的程序同一时间只能有一个线程在执行。
 *
 * 2乐观锁又称为“无锁”,顾名思义，它是乐观派。乐观锁总是假设对共享资源的访问没有冲突，线程可以不停地执行，无需加锁也无需等待。
 * 而一旦多个线程发生冲突， 乐观锁通常是使用一种称为CAS的技术来保证线程执行的安全性。
 *  由于无锁操作中没有锁的存在，因此不肯能出现死锁的情况，也就是说乐观锁天生免疫死锁。
 *  乐观锁多用于“读多写少”的环境，避免频繁加锁影响性能；而悲观锁锁用于“写多读少”的环境。避免频繁失败和重试影响性能。
 */
public class suo {
    //value1：线程不安全
    private static int value1 = 0;
    //value2：使用乐观锁:乐观锁在Java中是通过使用无锁编程来实现，最常采用的是CAS算法
    private static AtomicInteger value2 = new AtomicInteger(0);
    //value3：使用悲观锁:悲观锁的实现方式是加锁
    private static int value3 = 0;
    private static synchronized void increaseValue3(){
        value3++;
    }

    public static void main(String[] args) throws Exception {
        //开启1000个线程，并执行自增操作
        for(int i = 0; i < 1000; ++i){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    value1++;
                    value2.getAndIncrement();
                    increaseValue3();
                }
            }).start();
        }
        //打印结果
        Thread.sleep(1000);
        System.out.println("线程不安全：" + value1);
        System.out.println("乐观锁(AtomicInteger)：" + value2);
        System.out.println("悲观锁(synchronized)：" + value3);
    }
}