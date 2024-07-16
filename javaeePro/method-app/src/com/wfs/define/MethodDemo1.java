package com.wfs.define;
// 方法
public class MethodDemo1 {
    public static void main(String[] args) {
        // 1 方法：一种语法结构，把一段代码封装成一个功能，为了重复调用
        int rs = sum(10,20);// 3调用方法
        System.out.println(rs);
    }
    // 2 方法格式： 修饰符 返回值类型 方法名（形参列表）{
    //  return 返回值;
    // }
    public static int sum(int a,int b){
        int c = a + b;
        return c;
    }
    // 4 使用好处 程序结构更清晰 提高效率
}
