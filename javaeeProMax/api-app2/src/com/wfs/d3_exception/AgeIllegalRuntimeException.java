package com.wfs.d3_exception;
// 运行时异常
// 1 定义类继承RuntimeException
// 2 重写构造器
// 3 通过throw new 异常类 来创建异常对象并抛出
// 运行时可出现
public class AgeIllegalRuntimeException extends RuntimeException{
    public AgeIllegalRuntimeException() {
    }

    public AgeIllegalRuntimeException(String message) {
        super(message);
    }
}
