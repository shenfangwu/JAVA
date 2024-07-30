package com.wfs.d3_transform_stream;

import java.io.*;

/**
 * InputStreamReader（字符输入转换流）
 * 解决不同编码时，字符流读取文本内容乱码的问题。
 * 解决思路：先获取文件的原始字节流，再将其按真实的字符集编码转成字符输入流，这样字符输入流中的字符就不乱码了
 */
public class InputStreamReaderTest {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {

        try (
                // 1 获取文件字节流
                InputStream is = new FileInputStream("io-app2/src/gbk_test.txt");
                // 2 将其按照指定字符集编码转成字符输入流
                Reader isr = new InputStreamReader(is, "GBK");
                // 3 把字符输入流装入字符输入缓冲流
                BufferedReader br = new BufferedReader(isr)) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
