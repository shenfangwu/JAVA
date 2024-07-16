package com.wfs.thisdemo;
// 了解this
public class Student {
    double score = 300;
    // 1 this是一个变量，可以用在方法中，用来拿到当前对象，哪个对象调用方法，this就指向哪个对象
    // 2 this用来解决对象的成员变量于方法内部的变量名称一样时，导致访问冲突问题
    public void printThis(){
        System.out.println(this);
    }
    public void printPass(double score){
        if(score>this.score){
            System.out.println("通过！");
        }else {
            System.out.println("没通过!");
        }
    }
}
