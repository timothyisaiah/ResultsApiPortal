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
}
