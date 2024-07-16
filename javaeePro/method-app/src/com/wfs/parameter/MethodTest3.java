package com.wfs.parameter;
// 参数传递案例：打印int类型的数组内容
// 输出一个int类型的数组内容，要求输出格式为：[11,22,33,44,55]
public class MethodTest3 {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55};
        printArray(arr);
    }
    public static void printArray(int[] arr){
        if(arr == null) {
            System.out.println(arr);
            return;
        }
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length-1){
                System.out.print(arr[i]);
            }else{
                System.out.print(arr[i]+", ");
            }
        }
        System.out.println("]");
    }
}
