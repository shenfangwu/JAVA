package com.wfs.d5_data_stream;

import java.io.*;

/**
 * 数据流
 * DataOutStream:允许把数据和其类型一并写出去。
 * DataInputStream:用于读取数据输出流写出去的数据。
 */
public class Test {
    public static void main(String[] args) {
        try (
                // 创建数据流时 需要包含一个基础的输出输入流
                DataOutputStream dos = new DataOutputStream(new FileOutputStream("io-app2/src/shujuliu.txt"));
                DataInputStream dis = new DataInputStream(new FileInputStream("io-app2/src/shujuliu.txt"));
        ) {
            dos.writeUTF("这是数据流");
            dos.writeUTF("hangdanyuan");
            dos.writeInt(101);
            // 读取数据时要与上文一致 一一对应
            String s0 = dis.readUTF();
            System.out.println(s0);
            String s1 = dis.readUTF();
            System.out.println(s1);
            int i = dis.readInt();
            System.out.println(i);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
