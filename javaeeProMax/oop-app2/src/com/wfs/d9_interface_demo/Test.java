package com.wfs.d9_interface_demo;
/**
 * 接口案例：更好的感受面向接口编程
 */

/**
 * 班级学生信息管理模块：设计一个班级学生的信息管理模块：学生的数据有：姓名、性别、成绩
 * 功能1：要求打印出全部学生的信息
 * 功能2：要求打印全班学生的平均成绩
 * 要求：功能业务可以灵活切换方案：方案A:能打印班级全部学生信息；打印平均分；方案B:能打印班级全部学生信息包括男女人数；打印平均分（去除最高、最低
 */
public class Test {
    public static void main(String[] args) {
        ClassManager classManager = new ClassManager();
        classManager.showAllInfo();
        classManager.showAllAve();
    }
}
