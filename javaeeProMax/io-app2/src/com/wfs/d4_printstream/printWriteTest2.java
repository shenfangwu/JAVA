package com.wfs.d4_printstream;

import java.io.FileWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Writer;

/**
 * PrintStream/PrintWriter（打印流）
 * 作用：打印流可以实现更方便、更高效的打印数据出去，能实现打印啥出去就是啥出去。
 */
public class printWriteTest2 {
    public static void main(String[] args) {
        try (PrintWriter ps = new PrintWriter(// 高级流没有追加的功能-》可接收低级流添加追加功能
                new FileWriter("io-app2\\src\\printWriter.txt",true))) {
            ps.println(1);
            ps.println('a');
            ps.println(75);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
