package com.wfs.controller;

import com.wfs.pojo.Student;
import com.wfs.pojo.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@RestController
public class requestController {
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
    // 3 Springboot方式接收简单参数
    // 如果方法形参名称与请求参数名称不匹配，可以使用 @RequestParam 完成映射。
    @RequestMapping("/simpleParam")
    public String simpleParam(@RequestParam(name = "name")String username, Integer age){
        System.out.println("Springboot方式接收简单参数: name:"+username+"\t"+"age:"+age);
        return "Springboot方式接收简单参数: name:"+username+"\t"+"age:"+age;
    }
    // 4 Springboot方式接收简单实体参数
    @RequestMapping("/simplePojo")
    public String simplePojo(User user){
        System.out.println("Springboot方式接收简单实体参数:"+user);
        return "Springboot方式接收简单实体参数: name:"+user.getName()+"\t"+
                "age:"+user.getAge()+"\t"+"score:"+user.getScore();
    }
    // 5 Springboot方式接收复杂实体参数
    @RequestMapping("/complexPojo")
    public String complexPojo(Student student){
        System.out.println("Springboot方式接收复杂实体参数:"+student);
        return "Springboot方式接收复杂实体参数:"+student;
    }
    // 6 Springboot方式接收数组参数
    @RequestMapping("/arrayParam")
    public String arrayParam(String[] hobby){
        System.out.println("Springboot方式接收数组参数:"+Arrays.toString(hobby));
        return "Springboot方式接收数组参数:"+Arrays.toString(hobby);
     }
    // 7 Springboot方式接收集合参数
    // 请求参数名与形参集合名称相同且请求参数为多个，@RequestParam 绑定参数关系
    @RequestMapping("/listParam")
    public String arrayParam(@RequestParam List<String> hobby){
        System.out.println("Springboot方式接收列表参数:"+hobby);
        return "Springboot方式接收列表参数:"+hobby;
    }
    // 8 Springboot方式接收日期参数
    @RequestMapping("/dateParam")
    public String dateParam(@DateTimeFormat(pattern = "yyyy-M-d H:mm:ss")LocalDateTime updateTime){
        System.out.println(updateTime);
        return updateTime.toString();
    }
    // 9 Springboot方式接收JSON参数
    @RequestMapping("/jsonParam")
    public String dateParam(@RequestBody Student student){
        System.out.println(student);
        return student.toString();
    }
    // 10 Springboot方式接收路径参数
    @RequestMapping("/pathParam/{id}")
    public String pathParam(@PathVariable Integer id){
        System.out.println("Springboot方式接收列表参数:"+id);
        return id.toString();
    }
}
