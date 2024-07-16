package com.wfs.javabean;
// 实体类的业务处理类
public class StudentOperator {
    private Student stu;
    public StudentOperator(Student stu){
        this.stu = stu;
    }
    public void printStudent(){
        if(stu.getScore()>60){
            System.out.println("通过！");
        }else {
            System.out.println("没通过!");
        }
    }
}
