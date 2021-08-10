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
@Table(schema = "everestg_campus_kayiwa", name = "eglearners")
@Getter
@Setter
@ToString
@Data
@Builder
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor(access = AccessLevel.PACKAGE)
public class Eglearners {
    @Id
    private Long learnerid;

    private String firstname;
    private String lastname;
    private String parentid;
    private String password;
    private String email;
    private String registrationnumber;


    public Eglearners() {
    }


    public Eglearners(Long learnerid, String firstname, String lastname, String parentid, String password, String email,
            String registrationnumber) {
        this.learnerid = learnerid;
        this.firstname = firstname;
        this.lastname = lastname;
        this.parentid = parentid;
        this.password = password;
        this.email = email;
        this.registrationnumber = registrationnumber;
    }


    public Long getLearnerid() {
        return learnerid;
    }


    public void setLearnerid(Long learnerid) {
        this.learnerid = learnerid;
    }


    public String getFirstname() {
        return firstname;
    }


    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }


    public String getLastname() {
        return lastname;
    }


    public void setLastname(String lastname) {
        this.lastname = lastname;
    }


    public String getParentid() {
        return parentid;
    }


    public void setParentid(String parentid) {
        this.parentid = parentid;
    }


    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getRegistrationnumber() {
        return registrationnumber;
    }


    public void setRegistrationnumber(String registrationnumber) {
        this.registrationnumber = registrationnumber;
    }

    
}
