package com.wfs.d1_char_stream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * 字符输出流注意事项
 * 字符输出流写出数据后，必须关闭流或者刷新流，写出的数据才生效
 * 实际：只有刷新或者关闭（自带刷新）的操作 缓冲区的内容才会写出去；除非缓冲区满了
 */
public class Test3_FileWriter {
    public static void main(String[] args) throws IOException {
        Writer fw = new FileWriter("io-app2\\src\\wfs3.txt");
        fw.write('a');
        fw.write(97);
        fw.write('方');
        fw.write("\r\n");
        fw.flush();
    }
}
