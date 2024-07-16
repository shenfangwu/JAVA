package com.wfs.test1;
// 找素数
/*
说明：除了1和它本身以外，不能被其他正整数整除，就叫素数。
比如：3、7就是素数，而9、21等等不是素数。
 */
public class Test7 {
    public static void main(String[] args) {
        int cnt = search(101,200);
        System.out.println("一共有"+cnt+"个素数");
    }
    public static int search(int start,int end){
        int cnt = 0;
        for (int i = start; i <= end; i++) {
            boolean flag = true;// 定义了flag标记位
            for (int j = 2; j <= i/2; j++) {// 遍历2到该数的一半的数据去判断是否有整除的数据，有则改变falg标记位的状态
                if(i%j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag){// 最终通过flag的状态判断是否是素数
                System.out.print(i+" ");
                cnt++;
            }
        }
        return cnt;
    }
}
