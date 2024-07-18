package com.wfs.d3_exception;
// 编译异常
// 1 定义类继承Exception
// 2 重写构造器
// 3 通过throw new 异常类 来创建异常对象并抛出
// 编译阶段就报错
public class AgeIllegalException extends Exception{
    public AgeIllegalException(String message) {
        super(message);
    }

    public AgeIllegalException() {
    }
}
