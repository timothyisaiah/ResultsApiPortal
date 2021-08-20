package com.timothyisaiah.resultsapiportal.entity.campus;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "everestg_campus_kayiwa", name = "egsubjects")
@Getter
@Setter
@ToString
@Data
@Builder
//@AllArgsConstructor(access = AccessLevel.PACKAGE)
//@NoArgsConstructor(access = AccessLevel.PACKAGE)
public class Egsubjects {
    @Id
    private Long subject_id;
    private String subject_name;
    private String subject_code;
    private String subject_curriculum;
    public Egsubjects() {
    }
    public Egsubjects(Long subject_id, String subject_name, String subject_code, String subject_curriculum) {
        this.subject_id = subject_id;
        this.subject_name = subject_name;
        this.subject_code = subject_code;
        this.subject_curriculum = subject_curriculum;
    }
    public Long getSubject_id() {
        return subject_id;
    }
    public void setSubject_id(Long subject_id) {
        this.subject_id = subject_id;
    }
    public String getSubject_name() {
        return subject_name;
    }
    public void setSubject_name(String subject_name) {
        this.subject_name = subject_name;
    }
    public String getSubject_code() {
        return subject_code;
    }
    public void setSubject_code(String subject_code) {
        this.subject_code = subject_code;
    }
    public String getSubject_curriculum() {
        return subject_curriculum;
    }
    public void setSubject_curriculum(String subject_curriculum) {
        this.subject_curriculum = subject_curriculum;
    }

    
}
