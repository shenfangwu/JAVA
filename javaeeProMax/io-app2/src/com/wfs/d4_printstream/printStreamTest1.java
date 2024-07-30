package com.wfs.d4_printstream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * PrintStream/PrintWriter（打印流）
 * 作用：打印流可以实现更方便、更高效的打印数据出去，能实现打印啥出去就是啥出去。
 */
public class printStreamTest1 {
    public static void main(String[] args) throws FileNotFoundException {
        try (PrintStream ps = new PrintStream("io-app2/src/printStream.txt")) {
            ps.println(1);
            ps.println('a');
            ps.println(79);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
