package com.timothyisaiah.resultsapiportal.repository.campus;

import com.timothyisaiah.resultsapiportal.entity.campus.Egsubjects;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EgsubjectsRepository extends JpaRepository<Egsubjects,Integer> {
    @Query(value = "SELECT s FROM egsubjects s WHERE s.subject_id=:subject_idParam", nativeQuery = true)
    Egsubjects findBySubject_id(@Param("subject_idParam") Long subject_id);
}
