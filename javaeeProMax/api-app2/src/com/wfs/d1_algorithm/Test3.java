package com.wfs.d1_algorithm;

/**
 * 二分查找：每次排除一半数据，查询数据的性能提高
 * 前提：数组中的数据是有序的
 */
public class Test3 {
    public static void main(String[] args) {
        int[] arr = {7,23,79,81,103,127,131,147};
        System.out.println(binarySearch(arr, 81));
    }
    public static int binarySearch(int[]arr,int data){
        int left = 0;
        int right = arr.length-1;
        while (left<=right){
            int mid = (left+right)/2;
            if(arr[mid] > data){
                right = mid-1;
            } else if (arr[mid] < data) {
                left = mid + 1;
            }else {
                return mid;
            }
        }
        return 0;
    }
}
