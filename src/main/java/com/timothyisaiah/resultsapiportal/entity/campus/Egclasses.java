package com.timothyisaiah.resultsapiportal.entity.campus;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "everestg_campus_kayiwa", name = "egclasses")
@Getter
@Setter
@ToString
@Data
@Builder
//@AllArgsConstructor(access = AccessLevel.PACKAGE)
//@NoArgsConstructor(access = AccessLevel.PACKAGE)
public class Egclasses {
    @Id
    private Long class_id;
    private int subject_id;
    private int year_of_study;
    private int semester_of_study;
    private Date start_date;
    private Date end_date;
    private Date date_created;
    private int intake;
    public Egclasses() {
    }
    public Egclasses(Long class_id, int subject_id, int year_of_study, int semester_of_study, Date start_date,
            Date end_date, Date date_created, int intake) {
        this.class_id = class_id;
        this.subject_id = subject_id;
        this.year_of_study = year_of_study;
        this.semester_of_study = semester_of_study;
        this.start_date = start_date;
        this.end_date = end_date;
        this.date_created = date_created;
        this.intake = intake;
    }
    public Long getClass_id() {
        return class_id;
    }
    public void setClass_id(Long class_id) {
        this.class_id = class_id;
    }
    public int getSubject_id() {
        return subject_id;
    }
    public void setSubject_id(int subject_id) {
        this.subject_id = subject_id;
    }
    public int getYear_of_study() {
        return year_of_study;
    }
    public void setYear_of_study(int year_of_study) {
        this.year_of_study = year_of_study;
    }
    public int getSemester_of_study() {
        return semester_of_study;
    }
    public void setSemester_of_study(int semester_of_study) {
        this.semester_of_study = semester_of_study;
    }
    public Date getStart_date() {
        return start_date;
    }
    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }
    public Date getEnd_date() {
        return end_date;
    }
    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }
    public Date getDate_created() {
        return date_created;
    }
    public void setDate_created(Date date_created) {
        this.date_created = date_created;
    }
    public int getIntake() {
        return intake;
    }
    public void setIntake(int intake) {
        this.intake = intake;
    }

    
}
