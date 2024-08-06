package com.wfs.d6_tcp3;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TCP多线程接收多客户端
 * 服务端用ServerSocket类来实现的
 */
public class Server {
    public static void main(String[] args) throws Exception {
        // 1 创建ServerSocket对象并为服务端注册端口
        ServerSocket serverSocket = new ServerSocket(8888);
        while (true) {
            // 2 ServerSocket调用accept方法，等待客户端的连接请求
            Socket socket = serverSocket.accept();
            System.out.println("有人上线了"+socket.getRemoteSocketAddress());
            // 3 创建子线程接收socket
            new GetDataThread(socket).start();
        }
    }
}
