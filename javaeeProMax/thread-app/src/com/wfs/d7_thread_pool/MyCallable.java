package com.wfs.d7_thread_pool;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    private int n;

    public MyCallable(int n) {
        this.n = n;
    }

    @Override
    public String call() throws Exception {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum+=i;
        }
        return Thread.currentThread().getName()+": "+n+"总和是："+sum;
    }
}