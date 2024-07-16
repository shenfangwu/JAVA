package com.wfs.string;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodOperator {
    private ArrayList<Food> foodArrayList = new ArrayList<>();
    // 1 手动添加菜品功能
    public void addFood(){
        Food newfood = new Food();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入菜品名称！！！");
        String newfoodName = sc.next();
        System.out.println("请输入菜品价格！！！");
        Double newfoodPrice = sc.nextDouble();
        System.out.println("请输入菜品描述！！！");
        String newfoodDesc = sc.next();

        newfood.setFoodName(newfoodName);
        newfood.setFoodPrice(newfoodPrice);
        newfood.setFoodDesc(newfoodDesc);
        foodArrayList.add(newfood);

        System.out.println("添加菜品成功！！！");
    }
    // 1- 系统添加菜品功能
    public void addFood(String newfoodName,double newfoodPrice,String newfoodDesc){
        Food newfood = new Food(newfoodName,newfoodPrice,newfoodDesc);
        foodArrayList.add(newfood);
    }
    // 2 展示菜品功能
    public void showFood(){
        for (int i = 0; i < this.foodArrayList.size(); i++) {
            System.out.println("菜品名称: "+foodArrayList.get(i).getFoodName());
            System.out.println("菜品价格: "+foodArrayList.get(i).getFoodPrice());
            System.out.println("菜品描述: "+foodArrayList.get(i).getFoodDesc());
        }
    }
    // 3 主页面
    public void start(){
        // 4 开发主页面
        while (true) {
            System.out.println("请选择功能！！！");
            System.out.println("1 上架菜品");
            System.out.println("2 浏览菜品");
            System.out.println("3 退出");
            Scanner sc = new Scanner(System.in);
            int code = sc.nextInt();
            switch (code){
                case 1:addFood();break;
                case 2:showFood();break;
                case 3:
                    System.out.println("再见！！！");
                    return;
                default:
                    System.out.println("输入号码错误，请重新输入！");
            }
        }
    }
}
