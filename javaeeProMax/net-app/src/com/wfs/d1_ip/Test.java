package com.wfs.d1_ip;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * InetAddress类的使用
 * 封装IP地址和域名
 */
public class Test {
    public static void main(String[] args) throws Exception {
        // 1 获取本机IP地址
        InetAddress ip1 = InetAddress.getLocalHost();
        System.out.println(ip1);
        // 2 根据IP或域名 得到inetAddress对象
        InetAddress ip2 = InetAddress.getByName("www.baidu.com");
        System.out.println(ip2);
        // 3 根据IP获取主机名
        System.out.println(ip1.getHostName());
        System.out.println(ip2.getHostName());
        // 4 获取IP对象的IP地址信息
        System.out.println(ip1.getAddress());
        // 5 在指定毫秒内，判断主机与该ip对应的主机是否能连通
        System.out.println(ip2.isReachable(6000));
    }
}
