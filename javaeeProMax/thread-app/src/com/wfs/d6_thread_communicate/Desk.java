package com.wfs.d6_thread_communicate;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Desk  {
    List<String> stringList = new ArrayList<>();
    private final Lock lk = new ReentrantLock();
    public synchronized void put(String name){
        try {

            if(stringList.size() == 0){
                System.out.println(name+"开始生产蛋糕");
                Thread.sleep(1000);
                System.out.println(name+"生产蛋糕完毕");
                stringList.add(name+"生产的蛋糕");
            }else {
                this.notifyAll();// 唤醒正在等待的所有线程
                this.wait();// 让当前线程等待并释放所占锁，直到另一个线程调用notify()方法或 notifyAll()方法
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public  synchronized void get(String name) {
        try {
            if(stringList.size() == 1){
                System.out.println(name+"吃了"+stringList.get(0));
                stringList.clear();
            }else{
                this.notifyAll();
                this.wait();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
