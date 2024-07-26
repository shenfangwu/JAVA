package com.wfs.d3_bytestream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * 字节输出流OutputStream
 *
 */
public class FileOutputStream_Test5 {
    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("file-io-app\\src\\wfsOut.txt");// 没文件会创建文件
        byte[] bytes = "我爱你中国".getBytes();
        os.write(bytes);// 可字节、字节数组、字节数组的一部分
        os.close();
    }
}
