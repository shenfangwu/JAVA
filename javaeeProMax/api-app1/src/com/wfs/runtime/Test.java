package com.wfs.runtime;

import java.io.IOException;

/**
 * Runtime
 * 代表程序所在的运行环境
 * Runtime是个单例类
 */
public class Test {
    public static void main(String[] args) throws IOException, InterruptedException {
        // 1 返回当前java应用程序关联的运行时对象
        Runtime r = Runtime.getRuntime();
        // 2 终止当前运行的虚拟机
        // r.exit(0);
        // 3 返回java虚拟机可用的处理器数
        System.out.println(r.availableProcessors());
        // 4 返回java虚拟机中的内存总量
        System.out.println(r.totalMemory());
        // 5 返回java虚拟机中的可用内存
        System.out.println(r.freeMemory());
        // 6 启动某个程序，并返回该程序的对象
        Process process = r.exec("D:\\soft\\QQ\\Bin\\QQ.exe");
        Thread.sleep(5000);
        process.destroy();
    }
}
