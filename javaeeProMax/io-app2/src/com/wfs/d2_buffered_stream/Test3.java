package com.wfs.d2_buffered_stream;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 案例：诗词排序并复制到一个新的文件中
 */
public class Test3 {
    public static void main(String[] args) throws IOException {
        try (
                // 1 创建读写通道，并用缓冲流包装
                Reader reader = new FileReader("io-app2\\src\\shici.txt");
                BufferedReader br = new BufferedReader(reader);
                Writer writer = new FileWriter("io-app2\\src\\newShici.txt");
                BufferedWriter bw = new BufferedWriter(writer);
        ) {
            // 2 选择容器存储文件内容
            ArrayList<String> arrayList = new ArrayList<>();
            String line;
            // 读取文件内容，并将空行标记为特殊字符串
            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) {
                    arrayList.add("\uFFFF" + line); // 使用特殊字符串标记空行
                } else {
                    arrayList.add(line);
                }
            }
            // 3 容器排序
            Collections.sort(arrayList);
            // 4 将容器内容保存到新文件中
            for (int i = 0; i < arrayList.size(); i++) {
                String sortedLine = arrayList.get(i);
                if (sortedLine.startsWith("\uFFFF")) {
                    sortedLine = sortedLine.substring(1); // 移除特殊标记
                }
                bw.write(sortedLine);
                bw.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}