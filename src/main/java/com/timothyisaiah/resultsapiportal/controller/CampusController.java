package com.timothyisaiah.resultsapiportal.controller;

import java.util.List;

import com.timothyisaiah.resultsapiportal.entity.campus.Eglearners;
import com.timothyisaiah.resultsapiportal.entity.campus.Eglesson_attendance;
import com.timothyisaiah.resultsapiportal.service.campus.CampusService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/campus")
public class CampusController {
    @Autowired
    CampusService campusService;

    @GetMapping("/")
    public ResponseEntity<List<Eglearners>> findAllEglearners(){
        return new ResponseEntity<>(campusService.getAllEglearners(), HttpStatus.OK);
    }

    @GetMapping("/attendance/{registration_number}")
    public ResponseEntity<List<Object[]>> getLessonAttendance(@PathVariable String registration_number){
        registration_number = registration_number.replace("-", "/");
        return new ResponseEntity<>(campusService.getAttendanceByRegistrationNumber(registration_number), HttpStatus.OK);
    }
}
