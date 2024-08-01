package com.wfs.d3_log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 使用日志记录
 */
public class Test {
    // Logger要用slf4j的
    public static final Logger LOGGER = LoggerFactory.getLogger("Test");
    public static void main(String[] args) {
        try {
            LOGGER.info("打印方法开始");
            Print(1,0);
            LOGGER.info("打印方法结束！");
        } catch (Exception e) {
            LOGGER.error("方法执行失败！！！");
        }
    }
    public static void  Print(int a,int b){
        LOGGER.debug("参数a:"+a);
        LOGGER.debug("参数b:"+b);
        int c = a/b;
        LOGGER.info("打印结果是："+c);
    }
}
