package com.springSecurityLearning.spring_security_Learning.service;



import com.springSecurityLearning.spring_security_Learning.data.userTable;
import com.springSecurityLearning.spring_security_Learning.repo.userRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class userServiceImpl implements userService{


//     private final  //userRepository //userRepository;
//
//    @Autowired
//    public userServiceImpl(com.user_management_system.user_management_system.repository.userRepository userRepository) {
//        this.userRepository = userRepository;
//    }

    @Autowired
    private userRepository userRepository;

    @Override
    public userTable saveUser(userTable user) {
        return userRepository.save(user);
    }

    @Override
    public List<userTable> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public userTable updateUser(Integer id, userTable user) {
        if(!userRepository.findById(id).isPresent() ){
            System.out.println(" id not found so creating new user ");
        }
        return userRepository.save(user);

    }

    @Override
    public String   deleteUser(Integer id ) {
        if(userRepository.findById(id).isPresent() ){
            userTable user = userRepository.findById(id).get();
            userRepository.delete(user);
            return " user deleted successfully ";
        }
        else {
            return "cannot find id give valid user Id ";
        }
    }

    @Override
    public userTable findUserById(Integer id) {
        Optional<userTable> userById  = userRepository.findById(id);
        if (userById.isPresent()){
            return userById.get();
        }
        return  null;

    }
}

