package com.wfs.d3_bytestream;

import java.io.*;

/**
 * 复制目标文件
 */
public class CopyTest {
    public static void main(String[] args) throws IOException {
        // 1 输入管道与输入文件链接
        InputStream is = new FileInputStream("file-io-app\\src\\wfs.txt");
        // 2 输出管道与输出文件链接
        OutputStream os = new FileOutputStream("file-io-app\\src\\newwfs.txt");
        // 3 缓冲区
        byte[] buffer = new byte[1024];
        // 4 读取字节数据并输出指定文件
        int len;
        while ((len = is.read(buffer))!=-1){
            os.write(buffer,0,len);
        }
        // 5 关闭管道
        os.close();
        is.close();
        System.out.println("复制完成！");
    }
}
