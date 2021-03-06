package com.example.user1.conroller;

import com.example.user1.domain.User;
import com.example.user1.mapper.UserMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;
    @RequestMapping("/users")
    public List<User> list(){
        System.err.println("user1");
        return userMapper.findAll();
    }
}
