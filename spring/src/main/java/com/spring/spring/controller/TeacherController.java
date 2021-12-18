package com.spring.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.spring.model.Student;
import com.spring.spring.model.Teacher;
import com.spring.spring.model.User;

@RestController
@RequestMapping("/api/v1")
public class TeacherController {
	
	@GetMapping("/teacher")
    public String getTeacher() {
        return "New Teacher";
    }
	
	@PostMapping("/teacher")
    public String postTeacherData(@RequestBody String student) {
        return student;
    }
	
	@GetMapping("/teacher/{id}/classes")
    public String getClasses() {
		Teacher t = new Teacher("teacher1", "password", "10");
        return t.getClasses();
    }
	
}
