package com.wfs.d7_thread_pool;

import java.util.concurrent.*;

/**
 * 线程池执行Callable任务
 */
public class Test1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 1 创建线程池对象
        ExecutorService es = new ThreadPoolExecutor(3,5,7,
                TimeUnit.SECONDS,new ArrayBlockingQueue<>(4), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());
        // 2 执行Callable任务
        Future<String> f1 = es.submit(new MyCallable(100));
        Future<String> f2 = es.submit(new MyCallable(200));
        Future<String> f3 = es.submit(new MyCallable(300));
        // 3 打印线程返回的结果
        System.out.println(f1.get());
        System.out.println(f2.get());
        System.out.println(f3.get());
    }
}
