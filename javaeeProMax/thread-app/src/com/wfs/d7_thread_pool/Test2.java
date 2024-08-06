package com.wfs.d7_thread_pool;

import java.util.concurrent.*;
/**
 * 1 使用Executor:是一个线程池的工具类，提供了很多静态方法用于返回不同特点的线程池对象。
 * 2 newFixedThreadPool newSingleThreadExecutor newCachedThreadPool() newScheduledThreadPool
 * 3 这些方法的底层，都是通过线程池的实现类ThreadPoolExecutor创建的线程池对象。
 * 4 大型并发系统环境中使用Executors如果不注意可能会出现系统风险。
 */
public class Test2 {
    public static void main(String[] args) throws Exception {
        // 1 创建线程池对象
        ExecutorService es = Executors.newFixedThreadPool(3);
        // 2 执行Callable任务
        Future<String> f1 = es.submit(new MyCallable(100));
        Future<String> f2 = es.submit(new MyCallable(200));
        Future<String> f3 = es.submit(new MyCallable(300));
        Future<String> f4 = es.submit(new MyCallable(400));
        // 3 打印线程返回的结果
        System.out.println(f1.get());
        System.out.println(f2.get());
        System.out.println(f3.get());
        System.out.println(f4.get());
    }
}
