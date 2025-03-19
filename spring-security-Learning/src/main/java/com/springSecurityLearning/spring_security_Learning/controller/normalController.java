package com.springSecurityLearning.spring_security_Learning.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/normal")
public class normalController {

    @GetMapping("/")
    public ResponseEntity<?> normalController(HttpServletRequest request) {
        return new ResponseEntity<>("SessionId is : "+request.getSession().getId(), HttpStatus.OK);
    }
}
