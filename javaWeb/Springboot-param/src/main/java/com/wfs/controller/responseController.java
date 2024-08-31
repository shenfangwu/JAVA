package com.wfs.controller;
import com.wfs.pojo.Result;
import com.wfs.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class responseController {

    @RequestMapping("/hello")
    public String hello(){
        System.out.println("hello!!!");
        return Result.success("hello!!!").toString();
    }
    @RequestMapping("/getUser")
    public User getUser(){
        User user = new User();
        user.setAge(20);
        user.setName("wfs");
        user.setScore(10000);
        return user;
    }
    @RequestMapping("/listUser")
    public List<User> getUsers(){
        List<User> users = new ArrayList<>();
        User user1 = new User();
        user1.setName("wfs");
        user1.setScore(100);
        user1.setAge(21);
        User user2 = new User();
        user2.setName("jsc");
        user2.setScore(90);
        user2.setAge(22);
        User user3 = new User();
        user3.setName("lgc");
        user3.setScore(80);
        user3.setAge(23);
        User user4 = new User();
        user4.setName("qf");
        user4.setScore(70);
        user4.setAge(24);
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        return users;
    }
}
