package com.wfs.d4_resource;

import java.io.*;

/**
 * try-catch-with-resource：更加简洁
 */
public class Test3 {
    public static void main(String[] args) throws IOException {
        // 资源使用完毕后会自动调用close方法
        // 资源：最终实现AutoCloseable接口
        try (InputStream is = new FileInputStream("file-io-app\\src\\wfs.txt");
             OutputStream os = new FileOutputStream("file-io-app\\src\\newwfs.txt");
        ) {
            // 3 缓冲区
            byte[] buffer = new byte[1024];
            // 4 读取字节数据并输出指定文件
            int len;
            while ((len = is.read(buffer)) != -1) {
                os.write(buffer, 0, len);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
