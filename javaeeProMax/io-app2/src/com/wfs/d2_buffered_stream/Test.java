package com.wfs.d2_buffered_stream;

import java.io.*;
/**
 * 字节缓冲流
 * 自带8kb缓冲池
 */
public class Test {
    public static void main(String[] args) throws IOException {

        try (
            InputStream is = new FileInputStream("io-app2\\src\\wfs3.txt");
            // 1 定义一个字节缓冲区输入流包装原始的字节输入流
            InputStream bis = new BufferedInputStream(is);
            OutputStream os = new FileOutputStream("io-app2\\src\\wfs4.txt");
            // 2 定义一个字节缓冲输出流包装原始的字节输出流
            OutputStream bos = new BufferedOutputStream(os);
        ) {
            byte[] buffer = new byte[1024];
            int len;
            while ((len = bis.read(buffer))!=-1){
                bos.write(buffer,0,len);
            }
            System.out.println("复制完成！！！");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
