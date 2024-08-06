package com.wfs.d5_synchronized_lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 使用Lock锁实现线程同步
 */
public class Account {
    private double money;
    private String cardid;
    private final Lock lk = new ReentrantLock();// 用final更加安全 不会被改动
    public synchronized void drawMoney(double money){
        String name = Thread.currentThread().getName();
        try {
            lk.lock();
            if(this.money>=money){
                System.out.println(name+"取钱"+money+"成功！");
                this.money -= money;
                System.out.println(name+"来取钱后，余额剩余："+this.money);
            }else {
                System.out.println(name+"来取钱，余额不足~");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {// 用到finally的原因是：防止try报错直接跳出去 导致锁没解开 其他进程进不来
            lk.unlock();
        }
    }
    public Account() {
    }

    public Account(double money, String cardid) {
        this.money = money;
        this.cardid = cardid;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getCardid() {
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid;
    }
}
