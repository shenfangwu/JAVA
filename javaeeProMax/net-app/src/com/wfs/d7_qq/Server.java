package com.wfs.d7_qq;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {
    public static List<Socket> sockets = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        // 1 创建ServerSocket对象，注册服务端端口。
        ServerSocket serverSocket = new ServerSocket(8527);
        while (true) {
            // 2 调用ServerSocket对象的accept()方法，等待客户端的连接，并得到Socket管道对象
            Socket socket = serverSocket.accept();
            System.out.println(socket.getRemoteSocketAddress()+"已加入聊天室~");
            // 3 将得到的socket放进静态数组中
            Server.sockets.add(socket);
            // 4 创建子线程去处理这个socket的数据
            new ServerReaderThread(socket).start();
        }
    }
}
