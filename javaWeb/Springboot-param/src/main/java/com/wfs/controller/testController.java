package com.wfs.controller;

import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
@RestController
public class testController {
    // 1 原始接收
    @RequestMapping("/originParam")
    public String originParam(HttpServletRequest request){
        String name = request.getParameter("name");
        String agestr = request.getParameter("age");
        int age = Integer.parseInt(agestr);
        System.out.println("原始接收: name:"+name+"\t"+"age:"+age);
        return "原始接收: name:"+name+"\t"+"age:"+age;
    }
    // 2 Springboot方式接收简单参数
//    @RequestMapping("/simpleParam")
//    public String simpleParam(String name,Integer age){
//        System.out.println("Springboot方式接收简单参数: name:"+name+"\t"+"age:"+age);
//        return "Springboot方式接收简单参数: name:"+name+"\t"+"age:"+age;
//    }
    @RequestMapping("/simpleParam")
    public String simpleParam(@RequestParam(name = "name")String username, Integer age){
        System.out.println("Springboot方式接收简单参数: name:"+username+"\t"+"age:"+age);
        return "Springboot方式接收简单参数: name:"+username+"\t"+"age:"+age;
    }
}
