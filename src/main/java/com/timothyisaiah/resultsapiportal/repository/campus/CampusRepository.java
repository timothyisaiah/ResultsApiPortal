package com.timothyisaiah.resultsapiportal.repository.campus;

import java.util.List;

import com.timothyisaiah.resultsapiportal.entity.campus.Eglearners;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface CampusRepository extends JpaRepository<Eglearners,Integer> {
    @Query("SELECT p FROM Eglearners p")
    List<Eglearners> findAllEglearners();
    @Modifying
    @Transactional
    @Query(value = "UPDATE eglearners SET password=:passwordParam WHERE registrationnumber=:registration_numberParam",nativeQuery = true)
    Integer updateLearnerPassword(@Param("registration_numberParam") String registration_number, @Param("passwordParam") String password);
}
