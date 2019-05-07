package com.lqbs.mriq.controller;

import com.lqbs.mriq.common.model.User;
import com.lqbs.mriq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/user")
    public List<User> getUser(){

        return userService.getUser();
    }

    @RequestMapping("/test")
    public  List<String> test(){

        List<String> person = new ArrayList<>();
        person.add("jackie");   //索引为0  //.add(e)
        person.add("peter");    //索引为1
        person.add("annie");    //索引为2
        person.add("martin");   //索引为3
        person.add("marry");    //索引为4
       return person;
    }


}
