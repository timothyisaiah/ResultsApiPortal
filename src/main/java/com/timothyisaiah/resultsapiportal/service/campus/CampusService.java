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
}
