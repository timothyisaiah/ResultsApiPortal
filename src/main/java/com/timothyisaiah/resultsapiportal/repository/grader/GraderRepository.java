package com.timothyisaiah.resultsapiportal.repository.grader;

import java.util.List;

import com.timothyisaiah.resultsapiportal.entity.grader.Users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface GraderRepository extends JpaRepository<Users,Integer> {
    @Query("SELECT u FROM Users u")
    List<Users> findAllUsers();
}
