package com.wfs.scanner;

import java.util.Scanner;

/**
 * 录入用户键盘输入的数据
 */
public class ScannerDemo1 {
    public static void main(String[] args) {
        // 1 导包一般是自动导包
        // 2 创建一个键盘扫描器对象
        Scanner sc = new Scanner(System.in);
        // 3 开始调用sc的功能，接收用户输入的数据
        System.out.println("请你输入你的年龄");
        int age = sc.nextInt();//等待用户输入一个整数
        System.out.println("你的年龄是："+age);
        System.out.println("请你输入你的名字");
        String name = sc.next();//等待用户输入一个字符串
        System.out.println(name+"欢迎你进入系统");
        // 4 System、String在JDK的java.lang包下
        // lang包不需要导入，是默认的包
    }
}
