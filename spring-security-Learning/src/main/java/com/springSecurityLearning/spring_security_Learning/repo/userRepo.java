package com.springSecurityLearning.spring_security_Learning.repo;

import com.springSecurityLearning.spring_security_Learning.data.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface userRepo extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}

