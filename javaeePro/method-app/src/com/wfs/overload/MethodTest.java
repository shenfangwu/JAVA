package com.wfs.overload;
// 方法重载的应用场景是 处理一类业务时提供多种解决方案
public class MethodTest {
    public static void main(String[] args) {
        fire();
        fire(1);
        fire(1.0);
    }
    public static void fire(){
        System.out.println("发射核弹");
    }
    public static void fire(int a){
        System.out.println("发射炸弹");
    }
    public static void fire(double a){
        System.out.println("发射氢弹");
    }
}
