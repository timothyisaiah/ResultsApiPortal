package com.timothyisaiah.resultsapiportal.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public ResponseEntity<List<Map>> getLessonAttendance(@PathVariable String registration_number){
        registration_number = registration_number.replace("-", "/");
        List<Map> attendenceList = new ArrayList<>();
        Map<String,Object> attendanceDetails;
        List<Object[]> attendences = campusService.getAttendanceByRegistrationNumber(registration_number);
        if(attendences != null){
            for(Object[] attend: attendences){
                attendanceDetails = new HashMap<>();
                attendanceDetails.put("numberoftimesattended", attend[0]);
                Integer classid = (Integer) attend[1];
                Integer subjectid = campusService.getClassByClassid(classid);
                Integer totalClasses = campusService.getClassTotal(classid);
                attendanceDetails.put("requiredmaximumattendance", totalClasses);
                List<Object[]> subjectDetails = campusService.getSubjectBySubject_id(subjectid);
                attendanceDetails.put("subjectName", subjectDetails.get(0)[0]);
                attendanceDetails.put("subjectCode", subjectDetails.get(0)[1]);
                attendenceList.add(attendanceDetails);
            }
        }

        return new ResponseEntity<>(attendenceList, HttpStatus.OK);
    }
}
