package com.example.users.conroller;

import com.example.users.domain.User;
import com.example.users.mapper.UserMapper;
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
        System.err.println("user2");
        return userMapper.findAll();
    }
}
