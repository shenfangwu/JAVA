package com.wfs.d3_udp2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * UDP多发多收
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
        while (true) {
            // 3 使用服务端对象利用数据包对象接收数据
            ds.receive(dp);
            System.out.print(new String(buf,0,dp.getLength()));
            System.out.print("(该数据源IP:"+dp.getAddress().getHostAddress());// 打印此数据包的来源IP
            System.out.println(" 该数据源PORT:"+dp.getPort()+")");// 打印此数据包的来源PORT
        }
    }
}
