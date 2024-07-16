package com.wfs.test1;

import java.util.Random;
import java.util.Scanner;

/*
一个大V直播时发起了抢红包活动，分别有：9、666、188、520、99999五个红包。
请模拟粉丝来抽奖，按照先来先得，随机抽取，抽完即止，
注意：一个红包只能被抽一次，先抽或后抽哪一个红包是随机的，示例如下（不一定是下面的顺序）：
 */
public class Test6 {
    public static void main(String[] args) {
        int[] moneys = {9, 666, 520, 1314, 88};
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            System.out.println("请你输入任意内容进行抽奖：");
            sc.next();
            while (true) {
                int index = r.nextInt(moneys.length);
                int money = moneys[index];
                if (money != 0) {
                    System.out.println("恭喜您，抽中了红包" + money);
                    moneys[index] = 0;
                    break;
                }
            }
        }
        System.out.println("活动结束。。");
    }
}
