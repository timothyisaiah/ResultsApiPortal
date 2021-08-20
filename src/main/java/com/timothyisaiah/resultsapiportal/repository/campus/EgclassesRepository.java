package com.timothyisaiah.resultsapiportal.repository.campus;

import com.timothyisaiah.resultsapiportal.entity.campus.Egclasses;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EgclassesRepository extends JpaRepository<Egclasses,Integer>{
    @Query(value = "SELECT c.subject_id FROM egclasses c WHERE c.class_id=:class_idParam", nativeQuery = true)
    Integer findByClass_id(@Param("class_idParam") Integer class_id);
}

public interface EgclassesRepository extends JpaRepository<Egclasses,Integer>{
    @Query(value = "SELECT c.subject_id FROM egclasses c WHERE c.class_id=:class_idParam", nativeQuery = true)
    Integer findByClass_id(@Param("class_idParam") Integer class_id);
}