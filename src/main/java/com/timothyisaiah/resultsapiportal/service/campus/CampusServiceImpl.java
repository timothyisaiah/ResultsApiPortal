package com.timothyisaiah.resultsapiportal.service.campus;

import java.util.List;

import com.timothyisaiah.resultsapiportal.entity.campus.Eglearners;
import com.timothyisaiah.resultsapiportal.repository.campus.CampusRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CampusServiceImpl implements CampusService {
    @Autowired
    CampusRepository campusRepository;

    @Override
    public List<Eglearners> getAllEglearners(){
        return campusRepository.findAllEglearners();
    } 
}
