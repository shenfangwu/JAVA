package com.wfs.d4_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
/**
 * 代理类
 */
public class ProxyUtil {
    public static Star createProxy(BigStar bigStar){

        /**
         * 参数一：类加载器 加载代理类，产生代理对象。，。
         * 参数二：真实业务对象的接口。(被代理的方法交给代理对象)
         * 参数三：代理的核心处理程序
         */
        // 产生代理对象
        Star starProxy = (Star) Proxy.newProxyInstance(ProxyUtil.class.getClassLoader(),
                new Class[]{Star.class},new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if(method.getName().equals("sing")){
                    System.out.println("准备话筒，收钱20");
                } else if (method.getName().equals("dance")) {
                    System.out.println("准备场地，收钱10");
                }
                return method.invoke(bigStar,args);
            }
        });
        return starProxy;
    }
}
