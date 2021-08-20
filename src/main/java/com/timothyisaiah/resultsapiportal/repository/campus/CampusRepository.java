package com.timothyisaiah.resultsapiportal.repository.campus;

import java.util.List;

import com.timothyisaiah.resultsapiportal.entity.campus.Eglearners;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CampusRepository extends JpaRepository<Eglearners,Integer> {
    @Query("SELECT p FROM Eglearners p")
    List<Eglearners> findAllEglearners();
    
}
