package com.springSecurityLearning.spring_security_Learning.controller;


import com.springSecurityLearning.spring_security_Learning.data.student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
public class studentController {

    List<student> students =new ArrayList<>(List.of(
           new student("aditya", 12),
            new student("shree", 19)
    ));

    @GetMapping("stud")
    public List<student> getStudents() {
        return students;
    }

    @GetMapping("csrf")
    public CsrfToken getCsrfToken(HttpServletRequest request) {
        return (CsrfToken) request.getAttribute("_csrf");
    }

    @PostMapping("stud")
    public student setStudents(@RequestBody student student) {
        this.students.add(student);
        return student;
    }
}
