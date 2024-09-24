package com.Exmple.demo.controller;

import com.Exmple.demo.dto.UserDto;
import com.Exmple.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/getUsers")
    public List<UserDto> getUser() {
        return userService.getAllUsers();   // http://localhost:8080/api/v1/getUser
    }
    @PostMapping("/addUser")
    public UserDto UserDto (@RequestBody UserDto userDto){
        return userService.saveUser(userDto);
    }
    @PutMapping("/updateUser")
    public UserDto updateUser(@RequestBody UserDto userDto){
        return userService.saveUser(userDto);
    }

}