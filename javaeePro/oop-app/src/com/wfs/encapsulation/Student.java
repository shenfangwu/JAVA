package com.wfs.encapsulation;
// 了解封装
// 1 封装：就是用类设计对象处理某一个事物的数据时，
// 应该把要处理的数据，以及处理这些数据的方法设计到一个对象中去
// 2 面向对象三大特征：封装、继承、多态
// 3 封装的设计规范：合理隐藏合理暴露
public class Student {
    // 4 公开的数据用public、私有的数据用private
     private double score;
     public void setScore(double score){
         // 把私有数据通过公开的函数跟用户交互，
         // 控制了用户输入的数据范围，更加安全
         if(score>=0&&score<=100){
             this.score = score;
         }else {
             System.out.println("数据非法！");
         }
     }
     public double getScore(){
         return score;
    }

}
