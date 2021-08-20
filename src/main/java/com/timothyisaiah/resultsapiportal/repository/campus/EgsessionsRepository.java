package com.timothyisaiah.resultsapiportal.repository.campus;



import com.timothyisaiah.resultsapiportal.entity.campus.Egsessions;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
public interface EgsessionsRepository extends JpaRepository<Egsessions,Integer>{
    @Query(value = "SELECT COUNT(c.learner_id FROM egclasses c WHERE c.class_id=:class_idParam", nativeQuery = true)
    Integer findByClass_total(@Param("class_idParam") Integer class_id);
    
}
