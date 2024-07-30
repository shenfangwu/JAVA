package com.wfs.d1_char_stream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * 文件字符输出流：FileWriter
 */
public class Test2_FileWriter {
    public static void main(String[] args) throws IOException {
        try (Writer fw = new FileWriter("io-app2\\src\\wfs2.txt")) {
            // 1 写一个字符
            fw.write('a');
            fw.write(97);
            fw.write('方');
            fw.write("\r\n");
            // 2 write(string) 写一个字符串
            fw.write("我爱你中国！！");
            fw.write("\r\n");
            // 3 write(String c,int pos,int len):写字符串的一部分出去
            fw.write("航弹院101wfs",0,3);
            fw.write("\r\n");
            // 4 write(char[] buffer) 写一个字符数组出去
            char[] buffer = {'黑','马','a','b','c'};
            fw.write(buffer);
            fw.write("\r\n");
        }

    }
}
