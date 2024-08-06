package com.wfs.d9_lianxi;

import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;

public class SendThread extends Thread{
    private List<String> gifts;

    public SendThread(List<String> gifts,String name) {
        super(name);
        this.gifts = gifts;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        Random r = new Random();
        try {
            while (true){
                synchronized (gifts){
                    if(gifts.size()<10){
                        break;
                    }
                    String rs = gifts.remove(r.nextInt(gifts.size()));
                    System.out.println(name + "发出了"+rs);
                }
                Thread.sleep(1);
            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
