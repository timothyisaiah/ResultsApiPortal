package com.timothyisaiah.resultsapiportal.controller;

import java.util.List;

import com.timothyisaiah.resultsapiportal.entity.grader.Users;
import com.timothyisaiah.resultsapiportal.service.grader.GraderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/grader")
public class GraderController {
    

    @Autowired
    GraderService graderService;

    @GetMapping("/")
    public ResponseEntity<List<Users>> findAllEglearners(){
        return new ResponseEntity<>(graderService.getAllUsers(), HttpStatus.OK);
    }
}
