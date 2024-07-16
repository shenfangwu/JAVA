package com.wfs.test1;
// 评委打分
/*
在唱歌比赛中，可能有多名评委要给选手打分，分数是[0 - 100]之间的整数。选手最后得分为：
去掉最高分、最低分后剩余分数的平均分，请编写程序能够录入多名评委的分数，并算出选手的最终得分。
 */
public class Test3 {
    public static void main(String[] args) {
        double[] arr = new double[]{11,22,33,44,55};
        double res = getAverageScore(arr);
        System.out.println(res);
    }
    public static double getAverageScore(double[] arr){
        double sum = 0;
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min) min = arr[i];
            if(arr[i]>max) max = arr[i];
            sum += arr[i];
        }
        double res = (sum-min-max)/(arr.length-1);
        return res;
    }

}
