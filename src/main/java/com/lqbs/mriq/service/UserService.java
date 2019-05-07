package com.lqbs.mriq.service;

import com.lqbs.mriq.common.model.User;
import com.lqbs.mriq.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public List<User> getUser(){
        return userMapper.selectUsers();
    }

}
