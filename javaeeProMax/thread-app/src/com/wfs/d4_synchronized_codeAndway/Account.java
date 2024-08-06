package com.wfs.d4_synchronized_codeAndway;

/**
 * 线程安全问题：多个线程，同时访问同一个共享资源，且存在修改该资源。
 */
public class Account {
    private double money;
    private String cardid;
    public void drawMoney(double money){
        String name = Thread.currentThread().getName();
        // 把访问共享资源的核心代码给上锁，以此保证线程安全。
        // 1 建议使用共享资源作为锁对象，对于实例方法建议使用this作为锁对象。
        // 2 对于静态方法建议使用字节码（类名.class）对象作为锁对象。
        synchronized (this) {
            if(this.money>=money){
                System.out.println(name+"取钱"+money+"成功！");
                this.money -= money;
                System.out.println(name+"来取钱后，余额剩余："+this.money);
            }else {
                System.out.println(name+"来取钱，余额不足~");
            }
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
