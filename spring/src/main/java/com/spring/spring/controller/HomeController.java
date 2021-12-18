package com.spring.spring.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class HomeController {

    @GetMapping("home")
    public String getHomePageGreeting() {
        return "Hello World";
    }

    @PostMapping("student")
    public String postStudentData(@RequestBody String name) {
        return "Data posted successfully";
    }
}
