package com.timothyisaiah.resultsapiportal.service.campus;

import java.util.List;

import com.timothyisaiah.resultsapiportal.entity.campus.Egclasses;
import com.timothyisaiah.resultsapiportal.entity.campus.Eglearners;
import com.timothyisaiah.resultsapiportal.entity.campus.Eglesson_attendance;
import com.timothyisaiah.resultsapiportal.entity.campus.Egsubjects;
import com.timothyisaiah.resultsapiportal.repository.campus.CampusRepository;
import com.timothyisaiah.resultsapiportal.repository.campus.EgclassesRepository;
import com.timothyisaiah.resultsapiportal.repository.campus.EglessonAttendanceRepository;
import com.timothyisaiah.resultsapiportal.repository.campus.EgsessionsRepository;
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
    public
    EglessonAttendanceRepository eglessonAttendanceRepository;

    @Autowired
    EgsubjectsRepository egsubjectsRepository;

    @Autowired
    EgsessionsRepository egsessionsRepository;

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

    @Override
    public Integer getClassTotal(Integer learner_id,Integer class_id){
        return egsessionsRepository.findByClass_total(learner_id,class_id);
    } 

    @Override
    public Integer getLearnerId(String registration){
        return eglessonAttendanceRepository.findByTheLearnerId(registration);
    }

    @Override
    public List<Object[]>  getClasses(Integer learner_id){
        return egsessionsRepository.findClasses(learner_id);
    } 

    @Override
    public Integer classesAttended(Integer learner_id, Integer class_id){
        return eglessonAttendanceRepository.findByLearnerIdAndRegistration(learner_id,class_id);
    }

    @Override
    public Integer updatelearnerpassword(String registration_number, String password){
        return campusRepository.updateLearnerPassword(registration_number,password);
    }
}
