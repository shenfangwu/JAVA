package com.wfs.d8_bs;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.*;

/**
 * 要求从浏览器中访问服务器
 * 并立即让服务器响应一个很简单的网页给浏览器展示
 * 航弹院101wfs\
 * 1 自己创建子线程
 * 2 使用线程池优化
 */
public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(8527);
        ThreadPoolExecutor pool = new ThreadPoolExecutor(16,16,10,
                TimeUnit.SECONDS,new ArrayBlockingQueue<>(8), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());
        while (true) {
            Socket socket = serverSocket.accept();
            System.out.println(socket.getLocalPort()+"申请访问！");
            pool.execute(new ServerThread(socket));
            // ServerThread runnable = new ServerThread(socket);
            // new Thread(runnable).start();
        }
    }
}
