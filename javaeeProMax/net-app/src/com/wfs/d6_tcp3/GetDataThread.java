package com.wfs.d6_tcp3;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class GetDataThread extends Thread {
    private Socket socket;

    public GetDataThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            InputStream is = null;
            // 1 从socket通信管道中得到字节输入流
            is = socket.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            while (true) {
                // 2 使用数据输入流读取客户端发送过来的消息
                String rs = null;
                try {
                    rs = dis.readUTF();
                } catch (IOException e) {
                    System.out.println("客户端已经下线~"+socket.getRemoteSocketAddress());
                    dis.close();
                    socket.close();
                    break;
                }
                System.out.println(rs);
                // 3 获取客户端IP
                System.out.println(socket.getRemoteSocketAddress());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
