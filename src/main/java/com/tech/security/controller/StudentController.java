package com.tech.security.controller;

import com.tech.security.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.processing.Generated;
import java.util.ArrayList;
import java.util.List;

@RestController

public class StudentController {

    List<Student> student=new ArrayList<>(List.of(new Student(1,"Pradeep",20),new Student(2,"Ramesh",30)));
    @GetMapping("students")
    public List<Student> getStudentList(){
        return student;

    }
    @PostMapping("addStudent")
    public List<Student> addStudent(@RequestBody Student std){
        student.add(std);
        return student;

    }
    @GetMapping("csrf")
    public CsrfToken getToken(HttpServletRequest http){
        return (CsrfToken) http.getAttribute("_csrf");
    }
}
