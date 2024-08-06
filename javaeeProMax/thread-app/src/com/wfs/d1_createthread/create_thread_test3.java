package com.wfs.d1_createthread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 创建线程的第三种方式：利用Callable接口、FutureTask类来实现。
 * 优点：可以返回线程执行完毕后的结果
 */
public class create_thread_test3 {
    public static void main(String[] args) throws Exception {
        /**
         * 1创建任务对象
         *  定义一个类实现Callable接口，重写call方法，封装要做的事情，和要返回的数据。
         */
        MyCallable myCallable = new MyCallable(10);
        /**
         * 2 把Callable类型的对象封装成FutureTask（线程任务对象）。
         */
        FutureTask futureTask = new FutureTask<>(myCallable);
        /**
         * 3 把线程任务对象交给Thread对象。
         *   调用Thread对象的start方法启动线程
         */
        new Thread(futureTask).start();
        System.out.println("这是主线程");
        /**
         * 4线程执行完毕后、通过FutureTask对象的的get方法去获取线程任务执行的结果。
         */
        System.out.println(futureTask.get());
    }
}
