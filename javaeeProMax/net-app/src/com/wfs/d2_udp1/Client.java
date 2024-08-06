package com.wfs.d2_udp1;

import java.net.*;

/**
 * Java提供了一个java.net.DatagramSocket类来实现UDP通信。
 * UDP一发一收
 * 客户端
 */
public class Client {
    public static void main(String[] args) throws Exception {
        System.out.println("---客户端启动---");
        // 1 创建客户端socket对象
        DatagramSocket ds = new DatagramSocket();// 可指定客户端端口
        // 2 创建UDP数据包对象
        byte[] buf = "这是客户端发的数据！！！".getBytes();
        DatagramPacket dp = new DatagramPacket(buf,buf.length,
                InetAddress.getLocalHost(),8517);// 指定缓冲区、缓冲区长度、发送目的IP、发送目的PORT
        // 3 客户端对象发送数据包对象
        ds.send(dp);
        // 4 关闭客户端对象
        ds.close();
    }
}
