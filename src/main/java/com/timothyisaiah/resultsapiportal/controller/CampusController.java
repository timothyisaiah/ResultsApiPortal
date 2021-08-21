package com.timothyisaiah.resultsapiportal.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.timothyisaiah.resultsapiportal.entity.campus.Eglearners;
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
        /////////////search learner id of a given student//////////
        Integer learnerid = campusService.getLearnerId(registration_number);
        //////////////Retrieve classes attended by the student////////////
        List<Object[]> classes = campusService.getClasses(learnerid);
        if(classes != null){
            for(Object[] attend: classes){
                attendanceDetails = new HashMap<>();
                Integer classid = (Integer) attend[0];
                // get total number classes attended by a given student
                Integer numberoflessonsattended = campusService.classesAttended(learnerid,Integer.parseInt(attend[0].toString()));
                attendanceDetails.put("numberoftimesattended",numberoflessonsattended);
                /////////////////Get subject id ///////////////////////////
                Integer subjectid = campusService.getClassByClassid(classid);
                /////////////////Get total classes to be attended///////////////
                Integer totalClasses = campusService.getClassTotal(learnerid,classid);
                attendanceDetails.put("requiredmaximumattendance", totalClasses);
                ////////////////Get Subject Details /////////////////////////
                List<Object[]> subjectDetails = campusService.getSubjectBySubject_id(subjectid);
                attendanceDetails.put("subjectName", subjectDetails.get(0)[0]);
                attendanceDetails.put("subjectCode", subjectDetails.get(0)[1]);
                attendenceList.add(attendanceDetails);
            }
        }

        return new ResponseEntity<>(attendenceList, HttpStatus.OK);
    }

    @GetMapping("/updatepassword/{registrationnumber}/{password}")
    public String updatepassword(@PathVariable String registration_number, @PathVariable String password){

        registration_number = registration_number.replace("-", "/");
        password = password.replace("-", "/");
        // //Update In Grader
        // Integer columnsUpdated = graderService.updateuserpassword(registration_number, password);
        // if(columnsUpdated > 0){
        //     System.out.println("Grader Table Successfully Updated");
        // }       
        //Update In Campus
        Integer columnsUpdated = campusService.updatelearnerpassword(registration_number, password);
        if(columnsUpdated > 0){
            System.out.println("Campus Table Successfully Updated");
        }
        return "success";
    }
}
