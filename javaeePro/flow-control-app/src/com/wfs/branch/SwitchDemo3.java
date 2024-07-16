package com.wfs.branch;

/**
 * switch的注意事项
 */
public class SwitchDemo3 {
    public static void main(String[] args) {
        // 1 表达式类型只能是byte、short、int、char，JDK5开始支持枚举，JDK7开始支持STRING、不支持double float long
        int  a = 10;
        double b = 0.1;
        double b1 = 0.2;
        double c = b + b1;// 浮点型精度会有误差
        System.out.println(a);
        System.out.println(c);// c == 0.30000000000000004
        switch (a){
            //.....
        }
        // 2 case的值不允许重复且只能是字面量，不能是变量
        // 3 不忘记使用break;否则会出现穿透现象
        // 4 当存在多个case分支代码相同时，可以把相同的代码放到一个case块中，简化代码
        String week = "周三";
        switch (week){
            case "周一":
            case "周二":
            case "周三":
            case "周四":
            case "周五":
                System.out.println("学习");
                break;
            case "周六":
                System.out.println("睡觉");
                break;
            case "周日":
                System.out.println("打游戏");
                break;
            default:
                System.out.println("不存在");
        }
    }
}
