package com.wfs.parameter;

// 比较两个int类型的数组是否相同，返回ture或则false
public class MethodTest4 {
    public static void main(String[] args) {
        int[] arrs1 = {10, 20, 30};
        int[] arrs2 = {10, 0, 30};
        boolean res = isSameIntArray(arrs1, arrs2);
        System.out.println(res);
    }

    public static boolean isSameIntArray(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null) {
            return false;
        }
        if (arr1 == null && arr2 == null) {
            return true;
        }
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
