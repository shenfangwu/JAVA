package com.wfs.d4_resource;

/**
 * try-cathc-finally
 * finally是无论如何都会执行一次
 */
public class finally_test1 {
    public static void main(String[] args) {
        try {
            System.out.println(10/2);
            return;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("finally执行1次");
        }
    }
}
