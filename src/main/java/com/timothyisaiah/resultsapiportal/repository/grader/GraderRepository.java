package com.timothyisaiah.resultsapiportal.repository.grader;

import java.util.List;

import com.timothyisaiah.resultsapiportal.entity.grader.Users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface GraderRepository extends JpaRepository<Users,Integer> {
    @Query("SELECT u FROM Users u")
    List<Users> findAllUsers();

    @Query(value = "SELECT u.name,u.nationality,u.email,u.registration FROM users u WHERE u.registration=:registrationnumberParam", nativeQuery = true)
    List<Object[]> findUserByRegistrationNumber(@Param("registrationnumberParam") String registration_number);
}
