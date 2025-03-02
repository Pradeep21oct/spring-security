package com.tech.security.controller;

import com.tech.security.model.Student;
import jakarta.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {

    @GetMapping("hello")
    public String hello(HttpServletRequest http){
        return "Hello "+http.getRequestedSessionId();

    }

}
