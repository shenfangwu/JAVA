package com.wfs.d9_lianxi;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 100份礼物，小红小明两人同时发送、当礼品小于10 则停止发送
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        // 1 把礼品放入数组
        List<String> gifts = new ArrayList<>();
        String[] names = {"iphone","包包","剃须刀","口红","鲜花"};
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            gifts.add(names[r.nextInt(names.length)]+(i+1));
        }
        // System.out.println(gifts);
        // 2 定义线程类，创建线程对象，去集合中拿礼物给别人
        SendThread s1 = new SendThread(gifts,"m");
        s1.start();
        SendThread s2 = new SendThread(gifts,"h");
        s2.start();

        s1.join();
        s2.join();
    }
}
