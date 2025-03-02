package com.tech.security;

import com.tech.security.model.Student;
import jakarta.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {
    List<Student> student=new ArrayList<>(List.of(new Student(1,"Pradeep",20),new Student(2,"Ramesh",30)));
    @GetMapping("hello")
    public String hello(HttpServletRequest http){
        return "Hello "+http.getRequestedSessionId();

    }
@PostMapping("addStudent")
public List<Student> addStudent(@RequestBody Student std){
       student.add(std);
       return student;

}
}
