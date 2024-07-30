package com.wfs.d3_transform_stream;

import java.io.*;

/**
 * OutputStreamWriter字符输出转换流
 * 作用：可以控制写出去的字符使用什么字符集编码。
 * 解决思路：获取字节输出流，再按照指定的字符集编码将其转换成字符输出流，以后写出去的字符就会用该字符集编码了
 */
public class OutputStreamWriterTest {
    public static void main(String[] args) throws IOException {

        try (   // 1 创建一个文件字节输出流
                OutputStream os = new FileOutputStream("io-app2/src/gbk_test.txt");
                // 2 把原始的字节输出流，按照指定的字符集编码转换成字符输出转换流
                Writer wos = new OutputStreamWriter(os,"GBK");
                // 3 把字符输出流包装成缓冲字符输出流
                BufferedWriter bw = new BufferedWriter(wos);
        ) {
            bw.newLine();
            bw.write("我爱你中国！");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
