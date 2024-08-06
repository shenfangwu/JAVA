package com.wfs.d5_tcp2;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TCP多发多收
 * 服务端用ServerSocket类来实现的
 */
public class Server {
    public static void main(String[] args) throws Exception {
        // 1 创建ServerSocket对象并为服务端注册端口
        ServerSocket serverSocket = new ServerSocket(8888);
        // 2 ServerSocket调用accept方法，等待客户端的连接请求
        Socket socket = serverSocket.accept();
        // 3 从socket通信管道中得到字节输入流
        InputStream is = socket.getInputStream();
        // 4 把原始的字节输入流包装成数据输入流
        DataInputStream dis = new DataInputStream(is);
        while (true) {
            // 5 使用数据输入流读取客户端发送过来的消息
            String rs = null;
            try {
                rs = dis.readUTF();
                System.out.println(rs);
                // 获取客户端IP
                System.out.println(socket.getRemoteSocketAddress());
            } catch (Exception e) {
                System.out.println("客户端已经下线~");
                dis.close();
                socket.close();
                break;
            }

        }
    }
}
