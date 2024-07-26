package com.wfs.d4_resource;

import java.io.*;

/**
 * 复制文件规范的写法
 */
public class finally_test2 {
    public static void main(String[] args) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            // 1 输入管道与输入文件链接
            is = new FileInputStream("file-io-app\\src\\wfs.txt");
            // 2 输出管道与输出文件链接
            os = new FileOutputStream("file-io-app\\src\\newwfs.txt");
            // 3 缓冲区
            byte[] buffer = new byte[1024];
            // 4 读取字节数据并输出指定文件
            int len;
            while ((len = is.read(buffer))!=-1){
                os.write(buffer,0,len);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (os != null) os.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                if (is != null) is.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
