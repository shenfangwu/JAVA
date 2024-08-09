package com.wfs.d3_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
// 元注解：修饰注解的注解 比如@Target @Retention
@Target({ElementType.METHOD})// 表示MyTest注解只可给方法使用
@Retention(RetentionPolicy.RUNTIME)// 表示MyTest注解运行时间一直到程序运行
public @interface MyTest {// 注解的定义格式

}
