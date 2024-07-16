package com.wfs.d9_interface_demo;

import java.util.ArrayList;

interface studentOperator1{// 第一种方案
    public void showAllInfo(ArrayList<Student> studentArrayList);
    public void showAllAve(ArrayList<Student> studentArrayList);
}
interface studentOperator2{// 第二种方案
    public void showAllInfo();
    public void showAllAve();
}
public class classOperator implements studentOperator1{
    @Override
    public void showAllInfo(ArrayList<Student> studentArrayList) {
        for (int i = 0; i < studentArrayList.size(); i++) {
             Student student = studentArrayList.get(i);
             System.out.println("姓名："+student.getName()+",性别:"+student.getSex()+",分数："+student.getScore());
        }
    }

    @Override
    public void showAllAve(ArrayList<Student> studentArrayList) {
        double sum = 0;
        for (int i = 0; i < studentArrayList.size(); i++) {
            Student student = studentArrayList.get(i);
            sum += student.getScore();
        }
        System.out.println("平均分是："+sum/studentArrayList.size());
    }
}
