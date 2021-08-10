package com.timothyisaiah.resultsapiportal.repository.campus;

import java.util.List;

import com.timothyisaiah.resultsapiportal.entity.campus.Egsubjects;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EgsubjectsRepository extends JpaRepository<Egsubjects,Integer> {
    @Query(value = "SELECT s.subject_name,s.subject_code FROM egsubjects s WHERE s.subject_id=:subject_idParam", nativeQuery = true)
    List<Object[]> findBySubject_id(@Param("subject_idParam") Integer subject_id);
}
