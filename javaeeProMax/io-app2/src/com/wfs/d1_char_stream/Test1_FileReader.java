package com.wfs.d1_char_stream;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * 文件字符输入流：FileReader
 *
 */
public class Test1_FileReader {
    public static void main(String[] args) throws IOException {
        // 1 创建一个字符输入流通道与源文件绑定
        try(Reader fr = new FileReader("io-app2\\src\\wfs.txt");) {
            char[] buffer = new char[3];
            int len;
            // 2 读取源文件数据
            while ((len = fr.read(buffer)) != -1) {
                System.out.println(new String(buffer,0,len));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
