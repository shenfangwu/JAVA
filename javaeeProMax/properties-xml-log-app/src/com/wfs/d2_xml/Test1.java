package com.wfs.d2_xml;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 写入XML文件数据
 */
public class Test1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\r\n");
        sb.append("<hangdanyuan>\n");
        sb.append("\t<A0A id = \"1\" >\n");
        sb.append("\t\t<name>wfs</name>\n");
        sb.append("\t\t<job>skgy</job>\n");
        sb.append("\t</A0A>\n");
        sb.append("</hangdanyuan>\n");
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("properties-xml-log-app/src/wfs.xml"));) {
            bw.write(sb.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
