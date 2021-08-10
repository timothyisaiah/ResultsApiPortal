package com.timothyisaiah.resultsapiportal.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.timothyisaiah.resultsapiportal.entity.grader.Users;
import com.timothyisaiah.resultsapiportal.service.grader.GraderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/grader")
public class GraderController {
    

    @Autowired
    GraderService graderService;

    @Autowired
    CampusController campusController;

    @GetMapping("/")
    public ResponseEntity<List<Users>> findAllEglearners(){
        return new ResponseEntity<>(graderService.getAllUsers(), HttpStatus.OK);
    }


    @GetMapping("/attendance/{registration_number}")
    public ResponseEntity<Map<String,Object>> getLessonAttendance(@PathVariable String registration_number){
        registration_number = registration_number.replace("-", "/");
        Map<String,Object> studentMap = new HashMap<>();
        List<Object[]> studentBio = graderService.getUserByRegistrationNumber(registration_number);
        if(studentBio!=null){
            studentMap.put("studentName", studentBio.get(0)[0]);
            studentMap.put("nationality", studentBio.get(0)[1]);
            studentMap.put("email", studentBio.get(0)[2]);
            studentMap.put("registration", studentBio.get(0)[3]);

        }else{
            studentMap.put("studentName", "");
            studentMap.put("nationality", "");
            studentMap.put("email", "");
            studentMap.put("registration", "");
        }
            studentMap.put("classesAttended", campusController.getLessonAttendance(registration_number));


        return new ResponseEntity<>(studentMap, HttpStatus.OK);
    }
}

