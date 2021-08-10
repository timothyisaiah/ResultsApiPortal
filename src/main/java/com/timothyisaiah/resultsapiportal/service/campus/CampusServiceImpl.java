package com.timothyisaiah.resultsapiportal.service.campus;

import java.util.List;

import com.timothyisaiah.resultsapiportal.entity.campus.Egclasses;
import com.timothyisaiah.resultsapiportal.entity.campus.Eglearners;
import com.timothyisaiah.resultsapiportal.entity.campus.Eglesson_attendance;
import com.timothyisaiah.resultsapiportal.entity.campus.Egsubjects;
import com.timothyisaiah.resultsapiportal.repository.campus.CampusRepository;
import com.timothyisaiah.resultsapiportal.repository.campus.EgclassesRepository;
import com.timothyisaiah.resultsapiportal.repository.campus.EglessonAttendanceRepository;
import com.timothyisaiah.resultsapiportal.repository.campus.EgsubjectsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CampusServiceImpl implements CampusService {
    @Autowired
    CampusRepository campusRepository;

    @Autowired
    EgclassesRepository egclassesRepository;

    @Autowired
    EglessonAttendanceRepository eglessonAttendanceRepository;

    @Autowired
    EgsubjectsRepository egsubjectsRepository;


    @Override
    public List<Object[]> getAttendanceByRegistrationNumber(String registration_number){
        return eglessonAttendanceRepository.findByRegistration_number(registration_number);
    } 
    
    @Override
    public Integer getClassByClassid(Integer class_id){
        return egclassesRepository.findByClass_id(class_id);
    } 


    @Override
    public List<Object[]> getSubjectBySubject_id(Integer subject_id){
        return egsubjectsRepository.findBySubject_id(subject_id);
    } 

    @Override
    public List<Eglearners> getAllEglearners(){
        return campusRepository.findAllEglearners();
    } 

}
