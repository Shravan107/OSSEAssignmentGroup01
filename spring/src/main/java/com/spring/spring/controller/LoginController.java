package com.spring.spring.controller;

import com.spring.spring.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class LoginController {

    @GetMapping("/user")
    public User getUser() {
        return new User("rishav", "password");
    }
    @PostMapping("user")
    public User postUser(@RequestBody User user) {
        System.out.println(user.getUsername());
        return user;
    }

}
