package com.timothyisaiah.resultsapiportal.service.campus;

import java.util.List;

import com.timothyisaiah.resultsapiportal.entity.campus.Egclasses;
import com.timothyisaiah.resultsapiportal.entity.campus.Eglearners;
import com.timothyisaiah.resultsapiportal.entity.campus.Eglesson_attendance;
import com.timothyisaiah.resultsapiportal.entity.campus.Egsubjects;


public interface CampusService {
    List<Eglearners> getAllEglearners();
    Integer getClassByClassid(Integer class_id);
    List<Object[]> getAttendanceByRegistrationNumber(String registration_number);
    List<Object[]> getSubjectBySubject_id(Integer subject_id);
    Integer getClassTotal(Integer learner_id ,Integer class_id);
    Integer getLearnerId(String registration_number);
    List<Object[]> getClasses(Integer learner_id);
    Integer classesAttended(Integer learner_id, Integer class_id);
}
