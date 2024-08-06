package com.wfs.d4_tcp1;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * TCP一发一收
 * 客户端程序就是通过java.net包下的Socket类来实现的。
 */
public class Client {
    public static void main(String[] args) throws Exception {
        System.out.println("----客户端启动----");
        // 1 创建Socket对象并同时请求与服务端程序的连接
        Socket socket = new Socket("127.0.0.1",8888);
        // 2 从Socket通信管道中得到一个字节输出流，用来发数据给服务端程序
        OutputStream os = socket.getOutputStream();
        // 3 把低级字节输出流包装成数据输出流
        DataOutputStream dos = new DataOutputStream(os);
        // 4 开始写数据
        dos.writeUTF("这是客户端数据");
        dos.close();
        // 5 释放资源
        socket.close();

    }
}
