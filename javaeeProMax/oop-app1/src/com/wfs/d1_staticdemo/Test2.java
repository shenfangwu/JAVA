package com.wfs.d1_staticdemo;

/**
 * 类变量的应用场景：系统启动后，要求用户类记住自己创建多少个用户对象
 */
public class Test2 {
    // 在开发中，若某个数据只需要一份，且希望能够被共享（访问、修改），则该数据可以定义成类变量来记住
    public static void main(String[] args) {
        User user1 = new User();
        User user2 = new User();
        User user3 = new User();
        System.out.println(User.number);
    }
}
