package com.Exmple.demo.controller;

import com.Exmple.demo.dto.UserDto;
import com.Exmple.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/getUser")
    public List<UserDto> getUser() {
        return userService.getAllUsers();   // http://localhost:8080/api/v1/getUser
    }

}