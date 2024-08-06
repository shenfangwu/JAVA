package com.wfs.d3_safe_thread;

/**
 * 线程安全问题：多个线程，同时访问同一个共享资源，且存在修改该资源。
 */
public class Account {
    private double money;
    private String cardid;
    public void drawMoney(double money){
        String name = Thread.currentThread().getName();
        if(this.money>=money){
            System.out.println(name+"取钱"+money+"成功！");
            this.money -= money;
            System.out.println(name+"来取钱后，余额剩余："+this.money);
        }else {
            System.out.println(name+"来取钱，余额不足~");
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
