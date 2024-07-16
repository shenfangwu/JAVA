package com.wfs.string;

import java.util.Scanner;

/*
模仿外卖系统中的商家系统:完成菜品的上架、以及菜品信息浏览功能
 */
public class stringTest3 {
    public static void main(String[] args) {
        // 1 完成food类
        // 2 完成food操作类
        // 3 提前添加数据

        FoodOperator foodOperator = new FoodOperator();
        foodOperator.addFood("红烧肉",40,"入口即化！");
        foodOperator.addFood("红烧排骨",40,"酸甜口！");
        foodOperator.addFood("锅包肉",40,"酸甜可口！");
        foodOperator.start();
    }
}
