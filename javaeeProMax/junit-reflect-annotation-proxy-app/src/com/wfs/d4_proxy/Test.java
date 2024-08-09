package com.wfs.d4_proxy;
/**
 * 动态代理主要是对被代理对象的行为进行代理。
 */
public class Test {
    public static void main(String[] args) {
        ProxyUtil proxyUtil = new ProxyUtil();
        BigStar bigStar = new BigStar("wfs");
        Star star   = proxyUtil.createProxy(bigStar);
        String rs = star.sing("123");
        System.out.println(rs);
    }
}
