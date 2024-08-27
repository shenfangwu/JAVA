package com.wfs.d3_annotation;

import java.lang.reflect.Method;

/**
 * 需求：注解解析的案例
 * 定义注解Book，要求如下：
    * - 包含属性：String value()   书名
    * - 包含属性：double price()  价格，默认值为 10
    * - 包含属性：String[] authors() 作者
    * - 限制注解使用的位置：类和成员方上
    * - 指定注解的有效范围：RUNTIME
 * 定义BookStore类，在类和成员方法上使用Book注解
 * 定义AnnotationDemo测试类获取Book注解上的数据
 */
public class AnnotationDemo {
    public static void main(String[] args) throws NoSuchMethodException {
        // 获取BookStore类的注解信息
        Class<BookStore> bookStoreClass = BookStore.class;
        Book classAnnotation = bookStoreClass.getAnnotation(Book.class);
        if (classAnnotation != null) {
            System.out.println("Class Annotation:");
            System.out.println("Book Name: " + classAnnotation.value());
            System.out.println("Price: " + classAnnotation.price());
            System.out.println("Authors: " + String.join(", ", classAnnotation.authors()));
        }

        // 获取BookStore类中displayBookInfo方法的注解信息
        Method method = bookStoreClass.getMethod("displayBookInfo");
        Book methodAnnotation = method.getAnnotation(Book.class);
        if (methodAnnotation != null) {
            System.out.println("\nMethod Annotation:");
            System.out.println("Book Name: " + methodAnnotation.value());
            System.out.println("Price: " + methodAnnotation.price());
            System.out.println("Authors: " + String.join(", ", methodAnnotation.authors()));
        }
    }
}