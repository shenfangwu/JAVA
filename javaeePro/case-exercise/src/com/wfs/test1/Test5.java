package com.wfs.test1;
/*
请把一个整型数组，例如存了数据：11，22，33，拷贝成一个一模一样的新数组出来。
 */
public class Test5 {
    public static void main(String[] args) {
        int[] arr = {11,22,33};
        int[] arr1 = copy(arr);
        printArray(arr1);
    }
    public  static void printArray(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length-1?arr[i]:arr[i]+",");
        }
        System.out.println("]");
    }
    public static int[] copy(int[]arr){
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }
        return arr1;
    }
}
