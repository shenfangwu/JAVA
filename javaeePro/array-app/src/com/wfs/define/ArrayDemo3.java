package com.wfs.define;
// 数组的遍历
public class ArrayDemo3 {
    public static void main(String[] args) {
        // 数组的遍历：一个一个的访问一遍容器中的数据
        int[] ages = {20,30,40,50};
        for (int i = 0; i < ages.length; i++) {
            System.out.println(ages[i]);
        }
    }
}
