package com.wfs.branch;

/**
 * if分支语句
 */
public class IfDemo1 {
    public static void main(String[] args) {
        // 1 if分支：可以根据条件，选择执行某段程序
        // 2 3种写法
        // a
        double t = 36.9;
        if(t>37){
            System.out.println("此人生病了");
        }
        // b
        double mny = 19;
        if(mny >=90){
            System.out.println("发红包成功");
        }else{
            System.out.println("发失败");
        }
        // c
        int score = 78;
        if(score>=0&&score <60){
            System.out.println("你的绩效级别是：D");
        }else if(score>=60&&score<80){
            System.out.println("你的绩效级别是：C");
        }else if(score>=80&&score<90){
            System.out.println("你的绩效级别是：B");
        }else if(score>=90&&score<100){
            System.out.println("你的绩效级别是：A");
        }else{
            System.out.println("录入失败");
        }
    }
}
