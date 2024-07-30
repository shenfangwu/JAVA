package com.wfs.d2_buffered_stream;

import java.io.*;

/**
 * 字符缓冲流
 * BufferReader BufferWriter
 */
public class Test2 {
    public static void main(String[] args) throws IOException {
        try (
                // 写出
                Writer wt = new FileWriter("io-app2\\src\\newwfs.txt");
                BufferedWriter bwt = new BufferedWriter(wt);
                // 读入
                Reader r = new FileReader("io-app2\\src\\wfs.txt");
                BufferedReader br = new BufferedReader(r);)
        {
            char[] buffer = new char[1024];
            int len;
            while ((len = br.read(buffer)) != -1) {
                wt.write(buffer, 0, len);
            }
            System.out.println("复制完成！");
        }
    }
}
