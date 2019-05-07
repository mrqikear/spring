package com.lqbs.mriq.controller;

import com.lqbs.mriq.common.model.User;
import com.lqbs.mriq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HelloController {
    @Autowired
    private UserService userService;
    @RequestMapping("/hello")
    public String hello(ModelMap modelMap){
       List<User> ListUser = userService.getUser();
       User one  = ListUser.get(0);
       modelMap.put("user",one);
       return  "hello";
    }

}
