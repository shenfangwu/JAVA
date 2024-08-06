package com.wfs.d3_safe_thread;

public class DrawThread extends Thread{
    private Account acc;
    public DrawThread(Account acc,String name){
        super(name);
        this.acc = acc;
    }

    @Override
    public void run() {
        acc.drawMoney(100);
    }
}
