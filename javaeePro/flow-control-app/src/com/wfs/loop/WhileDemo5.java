package com.wfs.loop;

/**
 * while循环语句案例
 */
public class WhileDemo5 {
    public static void main(String[] args) {
        double peakheight = 8848860;
        double paperThickness = 0.1;
        int count = 0;
        while(paperThickness < peakheight){
            paperThickness = paperThickness*2;
            count++;
        }
        System.out.println("需要折叠多少次： "+count);
        System.out.println("最终纸张的厚度是： "+paperThickness);
    }
}
