package com.wfs.define;

import java.util.Scanner;

// 数组案例
// 某歌唱比赛，需要开发一个系统：可以录入6名评委的打分，录入完毕后立即输出平均分为选手得分
public class ArrayDemo6 {
    public static void main(String[] args) {
        // 1 定义动态数组以及scanner初始化
        double[] scores = new double[6];
        Scanner sc = new Scanner(System.in);
        // 2 保存评委打分并累加
        double sum = 0;
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入评委"+(i+1)+"打分");
            scores[i] = sc.nextDouble();
            sum += scores[i];
        }
        // 3 得出结果
        System.out.println("选手的得分是： "+sum/scores.length);

    }
}
