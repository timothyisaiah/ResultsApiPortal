package com.timothyisaiah.resultsapiportal.repository.campus;



import java.util.List;

import com.timothyisaiah.resultsapiportal.entity.campus.Egsessions;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

// import antlr.collections.List;
public interface EgsessionsRepository extends JpaRepository<Egsessions,Integer>{
    @Query(value = "SELECT COUNT(b.session_id) FROM egsessions b WHERE b.class_id=:class_idParam AND b.learner_id=:learner_idParam", nativeQuery = true)
    Integer findByClass_total(@Param("learner_idParam") Integer learner_id, @Param("class_idParam") Integer class_id);

    @Query(value = "SELECT c.class_id,c.learner_id FROM student_class_allocation c WHERE c.learner_id=:learner_idParam", nativeQuery = true)
    List<Object[]> findClasses(@Param("learner_idParam") Integer learner_idParam);
    
    
}
