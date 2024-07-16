package com.wfs.define;

// 数组案例
// 某部门6名员工的销售额分别是：16、26、36、6、100，请计算该部门的销售总额
public class ArrayTest4 {
    public static void main(String[] args) {
        int[] mny = {16, 26, 36, 6, 100};
        int sum = 0;
        for (int i = 0; i < mny.length; i++) {
            sum += mny[i];
        }
        System.out.println(sum);
    }
}
