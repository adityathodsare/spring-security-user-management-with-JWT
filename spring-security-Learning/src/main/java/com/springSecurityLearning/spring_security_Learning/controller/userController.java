package com.springSecurityLearning.spring_security_Learning.controller;



import com.springSecurityLearning.spring_security_Learning.data.userTable;

import com.springSecurityLearning.spring_security_Learning.service.userServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/user")
public class userController {


    @Autowired
    private userServiceImpl userServiceimpl;

    @PostMapping("/save")
    public ResponseEntity<?> saveUser(@RequestBody userTable user){
        userTable savedUser = userServiceimpl.saveUser(user);
        if (ObjectUtils.isEmpty(savedUser)){
            return new ResponseEntity<>("user not saved ", HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>("user saved successfully to database ", HttpStatus.CREATED);
    }


    @GetMapping("/getusers")
    public ResponseEntity<?> getAllUser (){
        List<userTable> allUser = userServiceimpl.getAllUser();

        if (ObjectUtils.isEmpty(allUser)){
            return new ResponseEntity<>("no user present ", HttpStatus.INTERNAL_SERVER_ERROR);
        }else{
            return new ResponseEntity<>(allUser,HttpStatus.OK);
        }

    }

    @PutMapping("update/{id}")
    public ResponseEntity<?> updateUser(@RequestBody userTable user, @PathVariable Integer id){
        userTable savedUser = userServiceimpl.updateUser(id,user);
        if (ObjectUtils.isEmpty(savedUser)){
            return new ResponseEntity<>("user not updated ", HttpStatus.INTERNAL_SERVER_ERROR);
        }
        else{
            return new ResponseEntity<>("user updated  successfully to database ", HttpStatus.CREATED);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteUser (@PathVariable Integer id){
        String allUser = userServiceimpl.deleteUser(id);

        if (ObjectUtils.isEmpty(allUser)){
            return new ResponseEntity<>("no user present ", HttpStatus.INTERNAL_SERVER_ERROR);
        }else{
            return new ResponseEntity<>(allUser,HttpStatus.OK);
        }

    }


    @GetMapping("/{id}")
    public ResponseEntity<?> getById (@PathVariable Integer id){
        userTable allUser = userServiceimpl.findUserById(id);

        if (ObjectUtils.isEmpty(allUser)){
            return new ResponseEntity<>("user not found ", HttpStatus.INTERNAL_SERVER_ERROR);
        }else{
            return new ResponseEntity<>(allUser,HttpStatus.OK);
        }

    }

}

