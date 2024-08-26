package com.wfs.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// 使用 SpringBoot 开发一个web应用，浏览器发起请求 /hello后，给浏览器返回字符串 "Hello World ~"。
@RestController
/**
 * @RestController一个组合注解，它结合了@Controller和@ResponseBody注解。
 * @Controller用于标识这个类是一个控制器类，
 * @ResponseBody表示控制器方法返回的内容将直接作为响应体返回给客户端，而不是视图名称
 */
public class HelloController {

    @RequestMapping("/hello")
    /**
     * 注解用于将HTTP请求映射到控制器方法。
     * 这里，/hello路径的GET请求将被映射到hello方法。
     */
    public String hello(){
        System.out.println("hello world!");
        return "hello world";
    }
}
