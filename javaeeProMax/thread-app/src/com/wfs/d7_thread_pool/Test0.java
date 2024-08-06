package com.wfs.d7_thread_pool;

import java.util.concurrent.*;

/**
 * 线程池执行Runnable任务
 */
public class Test0 {
    public static void main(String[] args) {
//        ThreadPoolExecutor(int corePoolSize,
//        int maximumPoolSize,
//        long keepAliveTime,
//        TimeUnit unit,
//        BlockingQueue<Runnable> workQueue,
//        ThreadFactory threadFactory,
//        RejectedExecutionHandler handler)
        // 1 创建线程池对象：主要包括核心线程数、最大线程数（核心+临时）、任务数、任务策略
        ExecutorService es = new ThreadPoolExecutor(3,5,7,
                TimeUnit.SECONDS,new ArrayBlockingQueue<>(4),Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());
        // 2 创建Runnable任务
        Runnable target = new MyRunnable();
        // 3 执行Runnable任务
        es.execute(target);
        es.execute(target);
        es.execute(target);
        es.execute(target);
        es.execute(target);
        es.execute(target);
        es.execute(target);
        // 此时核心满 任务队列满 产生临时线程
        es.execute(target);
        es.execute(target);
        // 此时核心满 任务队列满 临时线程满 开始拒绝任务
        es.execute(target);
    }
}
