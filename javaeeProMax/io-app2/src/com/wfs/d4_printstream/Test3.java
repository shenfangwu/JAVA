package com.wfs.d4_printstream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * 打印流的用途：输出重定向
 */
public class Test3 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("hangdanyuan");
        System.out.println("101");
        PrintStream ps = new PrintStream("io-app2/src/chongdingxiang.txt");
        // 改变out的引用
        System.setOut(ps);
        System.out.println("wfs");
    }
}
