package com.wfs.d2_buffered_stream;

import java.io.*;

/**
 * 缓冲流与原始流对比
 * 建议使用字节缓冲输入流、字节缓冲输出流，结合字节数组的方式，目前来看是性能最优的组合。
 */
public class compareTest4 {
    private static final String SRC_FILE = "D:\\jdk-17中文api.CHM";
    private static final String DEST_FILE = "D:\\";

    public static void main(String[] args) throws IOException {
        //copy01();
        copy02();
        //copy03();
        copy04();
    }

    private static void copy01() throws IOException {
        long startTime = System.currentTimeMillis();
        try (OutputStream os = new FileOutputStream(DEST_FILE + "CopyJdk.CHM");
             InputStream is = new FileInputStream(SRC_FILE);) {
            int b;
            while((b = is.read())!=-1){
                os.write(b);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("原始流一个字节一个字节传输所耗时间："+(endTime-startTime));
    }
    private static void copy02() throws IOException {
        long startTime = System.currentTimeMillis();
        try (OutputStream os = new FileOutputStream(DEST_FILE + "CopyJdk1.CHM");
             InputStream is = new FileInputStream(SRC_FILE);) {
            int b;
            byte[] buffer = new byte[1024];
            while((b = is.read(buffer))!=-1){
                os.write(buffer,0,1024);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("原始流配合自定义字节数组传输所耗时间："+(endTime-startTime));
    }
    private static void copy03() throws IOException {
        long startTime = System.currentTimeMillis();
        try (OutputStream os = new FileOutputStream(DEST_FILE + "CopyJdk2.CHM");
             BufferedOutputStream bos = new BufferedOutputStream(os,1024);
             InputStream is = new FileInputStream(SRC_FILE);
             BufferedInputStream bis = new BufferedInputStream(is,1024);
             ) {
            int b;
            while((b = bis.read())!=-1){
                bos.write(b);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("缓冲流一个字节一个字节传输所耗时间："+(endTime-startTime));
    }
    private static void copy04() throws IOException {
        long startTime = System.currentTimeMillis();
        try (OutputStream os = new FileOutputStream(DEST_FILE + "CopyJdk3.CHM");
             BufferedOutputStream bos = new BufferedOutputStream(os,8*1024);
             InputStream is = new FileInputStream(SRC_FILE);
             BufferedInputStream bis = new BufferedInputStream(is,8*1024);
        ) {
            int b;
            byte[] buffer = new byte[1024];
            while((b = bis.read(buffer))!=-1){
                bos.write(buffer,0,1024);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("缓冲流配合字节数组传输所耗时间："+(endTime-startTime));
    }
}
