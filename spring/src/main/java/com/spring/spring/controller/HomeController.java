package com.spring.spring.controller;

import com.spring.spring.model.Student;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class HomeController {

    @GetMapping("home")
    public String getHomePageGreeting() {
        return "Hello World";
    }

    @PostMapping("student")
    public Student postStudentData(@RequestBody Student student) {
        System.out.println(student.getName());
        return student;
    }
}
