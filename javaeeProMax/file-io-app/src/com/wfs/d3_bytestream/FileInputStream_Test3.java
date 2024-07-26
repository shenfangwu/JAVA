package com.wfs.d3_bytestream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * InputStream
 * 循环读取文件
 */
public class FileInputStream_Test3 {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("file-io-app\\src\\wfs.txt");
        byte[] buffer = new byte[3];
        int len;
        // 使用FileInputStream每次读取多个字节，读取性能会提升，但是读取汉字还是会出现乱码
        // 解决：定义一个与文件一样打的字节数组，一次性读完文件的全部字节
        while ((len = is.read(buffer))!=-1){
             String s = new String(buffer,0,len);
             System.out.print(s);
        }
        is.close();
    }
}
