package com.wfs.d1_createthread;
/**
  继承Thread类的方式进行多线程
  1 定义一个子类MyThread继承线程类java.lang.Thread，重写run()方法
  2 创建MyThread类的对象
  3 调用线程对象的start()方法启动线程（启动后还是执行run方法的）
 优点：编码简单
 缺点：线程类已经继承Thread，无法继承其他类，不利于功能的扩展。
 */
public class create_thread_test1 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        for (int i = 0; i < 3; i++) {
            System.out.println("这是主线程");
        }
    }
}
