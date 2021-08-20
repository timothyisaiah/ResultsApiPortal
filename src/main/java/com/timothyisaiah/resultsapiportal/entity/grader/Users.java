package com.timothyisaiah.resultsapiportal.entity.grader;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "everestg_grader", name = "users")
@Getter
@Setter
@ToString
@Data
@Builder
//@AllArgsConstructor(access = AccessLevel.PACKAGE)
//@NoArgsConstructor(access = AccessLevel.PACKAGE)
public class Users {
    
    @Id
    private Long id;

     private String name;
     private String nationality;
     private String email;
     private String registration;
     private String contact;
     private String role;
     private Integer status;
     private BigInteger school_id;
     private String program;
     private String dob;
     private Integer course;
     private Integer year;
     private String month;
     private Date email_verified_at;
     private String password;
     private String remember_token;
     private String flutter_api;
     private Date created_at;
     private Date updated_at;
     
  

    public Users() {
    }



    public Users(Long id, String name, String nationality, String email, String registration, String contact,
            String role, Integer status, BigInteger school_id, String program, String dob, Integer course, Integer year,
            String month, Date email_verified_at, String password, String remember_token, String flutter_api,
            Date created_at, Date updated_at) {
        this.id = id;
        this.name = name;
        this.nationality = nationality;
        this.email = email;
        this.registration = registration;
        this.contact = contact;
        this.role = role;
        this.status = status;
        this.school_id = school_id;
        this.program = program;
        this.dob = dob;
        this.course = course;
        this.year = year;
        this.month = month;
        this.email_verified_at = email_verified_at;
        this.password = password;
        this.remember_token = remember_token;
        this.flutter_api = flutter_api;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }



    public Long getId() {
        return id;
    }



    public void setId(Long id) {
        this.id = id;
    }



    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }



    public String getNationality() {
        return nationality;
    }



    public void setNationality(String nationality) {
        this.nationality = nationality;
    }



    public String getEmail() {
        return email;
    }



    public void setEmail(String email) {
        this.email = email;
    }



    public String getRegistration() {
        return registration;
    }



    public void setRegistration(String registration) {
        this.registration = registration;
    }



    public String getContact() {
        return contact;
    }



    public void setContact(String contact) {
        this.contact = contact;
    }



    public String getRole() {
        return role;
    }



    public void setRole(String role) {
        this.role = role;
    }



    public Integer getStatus() {
        return status;
    }



    public void setStatus(Integer status) {
        this.status = status;
    }



    public BigInteger getSchool_id() {
        return school_id;
    }



    public void setSchool_id(BigInteger school_id) {
        this.school_id = school_id;
    }



    public String getProgram() {
        return program;
    }



    public void setProgram(String program) {
        this.program = program;
    }



    public String getDob() {
        return dob;
    }



    public void setDob(String dob) {
        this.dob = dob;
    }



    public Integer getCourse() {
        return course;
    }



    public void setCourse(Integer course) {
        this.course = course;
    }



    public Integer getYear() {
        return year;
    }



    public void setYear(Integer year) {
        this.year = year;
    }



    public String getMonth() {
        return month;
    }



    public void setMonth(String month) {
        this.month = month;
    }



    public Date getEmail_verified_at() {
        return email_verified_at;
    }



    public void setEmail_verified_at(Date email_verified_at) {
        this.email_verified_at = email_verified_at;
    }



    public String getPassword() {
        return password;
    }



    public void setPassword(String password) {
        this.password = password;
    }



    public String getRemember_token() {
        return remember_token;
    }



    public void setRemember_token(String remember_token) {
        this.remember_token = remember_token;
    }



    public String getFlutter_api() {
        return flutter_api;
    }



    public void setFlutter_api(String flutter_api) {
        this.flutter_api = flutter_api;
    }



    public Date getCreated_at() {
        return created_at;
    }



    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }



    public Date getUpdated_at() {
        return updated_at;
    }



    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

     
}
