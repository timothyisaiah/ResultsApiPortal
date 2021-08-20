package com.timothyisaiah.resultsapiportal.repository.campus;

import java.util.List;

import com.timothyisaiah.resultsapiportal.entity.campus.Eglesson_attendance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EglessonAttendanceRepository extends JpaRepository<Eglesson_attendance,Integer>{
    @Query(value = "SELECT COUNT(a.attendance_id),a.class_id FROM eglesson_attendance AS a WHERE a.registration_number=:registration_numberParam", nativeQuery = true)
    List<Object[]> findByRegistration_number(@Param("registration_numberParam") String registration_number);

    @Query(value = "SELECT c.learner_id FROM eglesson_attendance AS c WHERE c.registration_number=:registration_numberParam", nativeQuery = true)
    Integer findByTheLearnerId(@Param("registration_numberParam") String registration_number);

    @Query(value = "SELECT COUNT(a.attendance_id) FROM eglesson_attendance AS a WHERE a.class_id=:class_idParam AND a.learner_id=:learner_idParam", nativeQuery = true)
     Integer findByLearnerIdAndRegistration(@Param("learner_idParam") Integer learner_id , @Param("class_idParam") Integer class_id);

}
