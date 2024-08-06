package com.wfs.d3_udp2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * UDP多发多收
 * 客户端
 */
public class Client {
    public static void main(String[] args) throws Exception {
        System.out.println("---客户端启动---");
        // 1 创建客户端socket对象
        DatagramSocket ds = new DatagramSocket();// 可指定客户端端口
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请说~");
            String line = sc.nextLine();
            if(line.equals("exit")){
                // 4 关闭客户端对象
                ds.close();
                System.out.println("退出成功！！！");
                break;
            }
            // 2 创建UDP数据包对象
            byte[] buf = line.getBytes();
            DatagramPacket dp = new DatagramPacket(buf,buf.length,
                    InetAddress.getLocalHost(),8517);// 指定缓冲区、缓冲区长度、发送目的IP、发送目的PORT

            // 3 客户端对象发送数据包对象
            ds.send(dp);

        }
    }
}
