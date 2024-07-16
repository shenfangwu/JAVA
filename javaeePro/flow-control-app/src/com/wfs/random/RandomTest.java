package com.wfs.random;

import java.util.Random;
import java.util.Scanner;

// Random练习：猜数字游戏
// 随机生成1-100的数字，提示用户猜测，猜大提示大，猜小提示小，直到猜中结束游戏
public class RandomTest {
    public static void main(String[] args) {
        // 1 生成随机数
        Random r = new Random();
        int luckNum = r.nextInt(100)+1;
        // 2 定义死循环 直到用户猜对数字
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("输入你的猜测： ");
            int guessNum = sc.nextInt();
            if(guessNum > luckNum){
                System.out.println("猜测大了");
            }else if(guessNum < luckNum){
                System.out.println("猜测小了");
            }else{
                System.out.println("猜对了");
                break;// 结束死循环
            }
        }
    }
}
