package com.spring.spring.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Teacher {
    private String username;
    private String password;
    private String classes;
}

