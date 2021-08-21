package com.timothyisaiah.resultsapiportal.service.grader;

import java.util.List;

import com.timothyisaiah.resultsapiportal.entity.grader.Users;
import com.timothyisaiah.resultsapiportal.repository.grader.GraderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GraderServiceImpl implements GraderService{
    @Autowired
    GraderRepository graderRepository;

    @Override
    public List<Users> getAllUsers(){
        return graderRepository.findAllUsers();
    }
    
    @Override
    public List<Object[]> getUserByRegistrationNumber(String registration_number){
        return graderRepository.findUserByRegistrationNumber(registration_number);
    }

    @Override
    public Integer updateuserpassword(String registration_number, String password){
        return graderRepository.updateUserPassword(registration_number,password);
    }

}
