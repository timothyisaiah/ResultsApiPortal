package com.timothyisaiah.resultsapiportal.service.grader;

import java.util.List;

import com.timothyisaiah.resultsapiportal.entity.grader.Users;

public interface GraderService {
    List<Users> getAllUsers();
    List<Object[]> getUserByRegistrationNumber(String registration_number);
    Integer updateuserpassword(String registration_number, String password);
}
