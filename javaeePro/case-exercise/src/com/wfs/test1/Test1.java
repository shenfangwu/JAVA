package com.wfs.test1;
// 买飞机票
/*
用户购买机票时，机票原价会按照淡季、旺季，头等舱还是经济舱的情况进行相应的优惠，
优惠方案如下：5-10月为旺季，头等舱9折，经济舱8.5折； 11月到来年4月为淡季，头等舱7折，经济舱6.5折，
请开发程序计算出用户当前机票的优惠价
 */
public class Test1 {
    // 思路：先用if判断旺季还是淡季，再用switch分别处理头等舱还是经济舱
    public static void main(String[] args) {
        double mny = calculate(1000,12,"头等舱");
        System.out.println("当前优惠价："+mny);
    }
    public static double calculate(double price,int month,String type){
        if(month>5 && month <= 10){
            switch (type){
                case "头等舱":
                    price *= 0.9;
                    break;
                case "经济舱":
                    price *= 8.5;
                    break;
            }
        }else if(month<=5||month>10){
                switch (type){
                    case "头等舱":
                        price *= 0.7;
                        break;
                    case "经济舱":
                        price *= 0.65;
                        break;
                }
        }
        return price;
    }
}
