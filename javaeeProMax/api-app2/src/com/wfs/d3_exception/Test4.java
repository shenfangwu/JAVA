package com.wfs.d3_exception;

import java.util.Scanner;

// 2 捕获异常，尝试重新修复
public class Test4 {
    public static void main(String[] args) {
        while (true) {
            try {
                System.out.println(getMoney());
                break;
            } catch (Exception e) {// 2 抓到异常 进入循环体
                System.out.println("请再次输入合法的数字：");
            }
        }
    }
    public static double getMoney() throws Exception{
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("请输入合适的价格：");
            double money = sc.nextDouble();//1 接收非数字 则抛出异常
            if(money >= 0){
                return money;
            }else{
                System.out.println("价格不合适");
                // 继续循环
            }
        }
    }
}
