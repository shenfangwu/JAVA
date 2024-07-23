package com.wfs.d1_parameter;

/**
 * 可变参数：一种特殊形参，定义在方法、构造器的形参列表里，格式是：数据类型...参数名称;
 * 特点：可以不传数据给它；可以传一个或者同时传多个数据给它；也可传一个数组给它
 * 好处：灵活接收数据
 */
public class Test {
    public static void main(String[] args) {
        test(1);
        test(1,2,3);
        test(1,2,3,4,5);
        test(new int[]{1,2,3,3,4});
     }
    // 1 一个形参列表中可变参数只能有1个
    // 2 可变参数必须放在形参列表最后面
    public static void test(int...num){
        // 3 可变参数在方法内部就是一个数组
        System.out.println(num.length);
    }
}
