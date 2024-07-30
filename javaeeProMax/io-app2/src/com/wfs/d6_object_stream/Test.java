package com.wfs.d6_object_stream;

import java.io.*;
import java.util.ArrayList;

/**
 * ObjectInputStream:创建对象字节输入流，包装基础的字节输入流
 * ObjectOutputStream:可以把Java对象进行序列化：把Java对象存入到文件中去。
 */
public class Test {
    public static void main(String[] args) {

        try(
                ObjectOutputStream oo = new ObjectOutputStream(
                        new FileOutputStream("io-app2/src/xuliehua.txt"));
                ObjectInputStream oi = new ObjectInputStream(
                        new FileInputStream("io-app2/src/xuliehua.txt"));)
        {
            // 2 ArrayList实现了Serializable接口 可批量序列化多个对象
            ArrayList<Integer> arrayList = new ArrayList<>();
            arrayList.add(1);
            arrayList.add(2);
            arrayList.add(3);
            arrayList.add(4);
            User u = new User();
            u.setName("wfs");
            u.setPsd("123456");
            oo.writeObject(arrayList);
            oo.writeObject(u);
            System.out.println("序列化成功！！！");
            System.out.println("反序列化成功！！！");
            ArrayList<Integer> arrayList1 = (ArrayList<Integer>)oi.readObject();
            System.out.println(arrayList1);
            User u0 = (User) oi.readObject();
            System.out.println(u0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
