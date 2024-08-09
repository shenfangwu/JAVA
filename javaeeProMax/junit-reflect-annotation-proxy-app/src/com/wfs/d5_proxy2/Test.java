package com.wfs.d5_proxy2;

import java.util.Arrays;

/**
 * 可以在不改变方法源码的情况下，实现对方法功能的增强，提高了代码的复用。
 * 简化了编程工作、提高了开发效率，同时提高了软件系统的可扩展性，。
 * 可以为被代理对象的所有方法做代理。
 * 非常的灵活，支持任意接口类型的实现类对象做代理，也可以直接为接本身做代理。
 * 创建代理类-》代理类对象绑定要代理的对象-》第3个参数是触发函数-》在触发函数中调用真正的方法
 */
public class Test {
    public static void main(String[] args) throws Exception {
        UserService userService = ProxyUtil.createProxy(new UserServicelmpl());
        userService.login("admin","123456");
        System.out.println("----------------------------------------");
        userService.deleteUsers();
        System.out.println("----------------------------------------");
        String[] names = userService.selectUsers();
        System.out.println("----------------------------------------");
        System.out.println("查询到的用户："+ Arrays.toString(names));
        System.out.println("----------------------------------------");
    }
}
