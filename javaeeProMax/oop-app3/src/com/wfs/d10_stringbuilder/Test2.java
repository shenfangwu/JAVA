package com.wfs.d10_stringbuilder;

public class Test2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5} ;
        showIntArr(arr);
    }
    public static void showIntArr(int[] arr){
        if (arr == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length-1){
                sb.append(arr[i]);
            }else {
                sb.append(arr[i]).append(',');
            }
        }
        System.out.println(sb+"]");
    }
}
