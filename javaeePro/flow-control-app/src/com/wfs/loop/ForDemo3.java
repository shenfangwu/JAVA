package com.wfs.loop;

/**
 * 使用for求奇数和
 */
public class ForDemo3 {
    public static void main(String[] args) {
        //1
        int sum1 = 0;
        for (int i = 1; i <= 100; i += 2) {
            sum1 += i;
        }
        System.out.println("奇数和：" + sum1);
        //2
        int sum2 = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {// if(i%2)这么写无效！！！ java是强类型语言在条件表达式中中i%2不能自动转换为布尔
                sum2 += i;
            }
        }
        System.out.println("奇数和：" + sum2);
    }
}
