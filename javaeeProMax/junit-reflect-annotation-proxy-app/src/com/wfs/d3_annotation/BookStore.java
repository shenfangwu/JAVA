package com.wfs.d3_annotation;

/**
 * 定义BookStore类，在类和成员方法上使用Book注解
 */

@Book(value = "Java Programming", authors = {"Author1", "Author2"})
public class BookStore {

    @Book(value = "Python Programming", price = 150, authors = {"Author3", "Author4"})
    public void displayBookInfo() {
        System.out.println("Displaying book info...");
    }
}