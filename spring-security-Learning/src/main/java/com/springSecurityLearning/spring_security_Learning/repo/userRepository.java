package com.springSecurityLearning.spring_security_Learning.repo;


import com.springSecurityLearning.spring_security_Learning.data.userTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface userRepository extends JpaRepository<userTable,Integer> {


    /*
    save(User entity): Saves or updates a User entity.
    findById(Integer id): Retrieves a User by its ID.
    findAll(): Retrieves all User entities.
    deleteById(Integer id): Deletes a User by its ID.
    count(): Returns the total number of User entities
     */

}

