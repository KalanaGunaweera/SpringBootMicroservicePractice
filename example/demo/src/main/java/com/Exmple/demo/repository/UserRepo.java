package com.Exmple.demo.repository;

import com.Exmple.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> {

//    void getUserById(int id);
    @Query(value = "SELECT * FROM User WHERE id= ?1  AND name =?2", nativeQuery = true)
    User getUserByIdAndName(int id, String name);
    //parameter placement of query in repository
    @Query(value = "SELECT * FROM User WHERE id= ?1 ", nativeQuery = true)
    User getUserById(int id);
    //parameter placement of query in repository
}
