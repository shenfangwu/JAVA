package com.wfs.d3_exception;

/**
 * 认识异常
 */
public class Test1 {
    public static void main(String[] args) {
        // 1 Throwable类是所有异常信息的超类（父类）。直接子类：Error类，Exception类。
        // 1.1Error类：是程序无法处理的错误，表示运行应用程序中较严重问题。Sun公司把这些问题封装成Error对象
        // 1.2Exception:叫异常，代表程序可能出现的问题。程序员使用Exception及其孩子封装程序出的问题
        // a 运行时异常 RuntimeException及其子类，编译期间不报错，比如数组越界
        // b 编译时异常  编译阶段就会出现错误提醒

        // 2 抛出异常：在方法上使用throws关键字，可以将方法内部出现的异常抛出去给调用者处理

        // 3 捕获异常（try...catch) 直接捕获程序出现的异常
    }
}
