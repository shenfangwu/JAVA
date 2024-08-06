package com.wfs.d7_qq;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {
        // 1 创建Socket对象并请求服务端连接
        Socket socket = new Socket("127.0.0.1",8527);
        System.out.println(socket.getInetAddress()+"成功加入聊天室~");
        // 2 创建子线程用于接收服务端的数据
        new ClientReaderThread(socket).start();
        // 3 使用socket对象调用getOutputStream()方法得到字节输出流。
        OutputStream os = socket.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        Scanner sc = new Scanner(System.in);
        while (true) {
            Thread.sleep(100);
            System.out.println("请说~");
            String msg = sc.nextLine();
            if(msg.equals("exit")){
                System.out.println("成功下线~");
                dos.close();
                socket.close();
            }
            // 4 发送数据
            dos.writeUTF(msg);
            dos.flush();
        }
    }
}
