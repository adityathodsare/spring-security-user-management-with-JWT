package com.springSecurityLearning.spring_security_Learning.service;

import com.springSecurityLearning.spring_security_Learning.data.User;
import com.springSecurityLearning.spring_security_Learning.data.userPrinciple;
import com.springSecurityLearning.spring_security_Learning.repo.userRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class myUserDetailService implements UserDetailsService {

    @Autowired
    private userRepo repo;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = repo.findByUsername(username);

        if(user == null) {
            System.out.println("user not found");
            throw new UsernameNotFoundException("user not found with name : "+username);
        }
        return new userPrinciple(user);
    }
}
