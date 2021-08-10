package com.timothyisaiah.resultsapiportal.repository.campus;

import java.util.List;

import com.timothyisaiah.resultsapiportal.entity.campus.Eglesson_attendance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EglessonAttendanceRepository extends JpaRepository<Eglesson_attendance,Integer>{
    @Query(value = "SELECT COUNT(a.attendance_id),a.class_id FROM eglesson_attendance AS a WHERE a.registration_number=:registration_numberParam", nativeQuery = true)
    List<Object[]> findByRegistration_number(@Param("registration_numberParam") String registration_number);
    
}
