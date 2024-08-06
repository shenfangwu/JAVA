package com.wfs.d5_tcp2;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * TCP多发多收
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
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请说：");
            String line = sc.nextLine();
            if("exit".equals(line)){
                System.out.println("欢迎下次光临");
                // 5 释放资源
                dos.close();
                socket.close();
                break;
            }
            // 4 开始写数据
            dos.writeUTF(line);
            dos.flush();
        }

    }
}
