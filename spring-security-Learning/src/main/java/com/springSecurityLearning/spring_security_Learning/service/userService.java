package com.springSecurityLearning.spring_security_Learning.service;



import com.springSecurityLearning.spring_security_Learning.data.userTable;


import java.util.List;

public interface userService {

    public userTable saveUser(userTable user);

    public List<userTable> getAllUser();

    public  userTable updateUser(Integer id, userTable user );

    public String  deleteUser(Integer id );

    public userTable findUserById(Integer id);




}

