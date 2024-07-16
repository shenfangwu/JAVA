package com.wfs.branch;

/**
 * switch分支语句
 */
public class SwitchDemo2 {
    public static void main(String[] args) {
        // 条件是区间时用if
        // 条件是与一个一个值进行比较时，用switch:格式良好，优雅
        String week = "周三";
        switch (week){
            case "周一":
                System.out.println("学习");
                break;
            case "周二":
                System.out.println("运动");
                break;
            case "周三":
                System.out.println("音乐");
                break;
            case "周四":
                System.out.println("跳舞");
                break;
            case "周五":
                System.out.println("吃饭");
                break;
            case "周六":
                System.out.println("睡觉");
                break;
            case "周日":
                System.out.println("喝水");
                break;
            default:
                System.out.println("不存在");
        }
    }
}
