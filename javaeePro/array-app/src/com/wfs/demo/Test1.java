package com.wfs.demo;
// 求数组最大值
public class Test1 {
    public static void main(String[] args) {
        int[] faceScores = {1,2,3,4,5,89,2,4};
        int max = faceScores[0];
        for (int i = 0; i < faceScores.length; i++) {
            if (faceScores[i]>max){
                max = faceScores[i];
            }
        }
        System.out.println("最大值是： "+max);
    }
}
