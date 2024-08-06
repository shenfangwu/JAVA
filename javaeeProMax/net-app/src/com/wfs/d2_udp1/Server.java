package com.wfs.d2_udp1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * UDP一发一收
 * 服务端
 */
public class Server {
    public static void main(String[] args) throws Exception {
        System.out.println("-----服务端开启-----");
        // 1 创建服务端对象，指定端口
        DatagramSocket ds = new DatagramSocket(8517);
        // 2 创建数据包对象
        byte[] buf = new byte[64*1024];
        DatagramPacket dp = new DatagramPacket(buf,buf.length);
        // 3 使用服务端对象利用数据包对象接收数据
        ds.receive(dp);
        System.out.println(new String(buf,0,dp.getLength()));
        // 4 释放资源
        ds.close();
    }
}
