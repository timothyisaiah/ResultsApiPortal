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
@Table(schema = "everestg_campus_kayiwa", name = "eglesson_attendance")
@Getter
@Setter
@ToString
@Data
@Builder
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor(access = AccessLevel.PACKAGE)
public class Eglesson_attendance {
    @Id
    private Long attendance_id;
    private int learner_id;
    private int class_id;
    private String exercise_score;
    private String tutor_remark;
    private int session_id;
    private String attendance_code;
    private int tutor_rating;
    private String registration_number;
    private int attendance_confirmed;
    public Eglesson_attendance() {
    }
    public Eglesson_attendance(Long attendance_id, int learner_id, int class_id, String exercise_score,
            String tutor_remark, int session_id, String attendance_code, int tutor_rating, String registration_number,
            int attendance_confirmed) {
        this.attendance_id = attendance_id;
        this.learner_id = learner_id;
        this.class_id = class_id;
        this.exercise_score = exercise_score;
        this.tutor_remark = tutor_remark;
        this.session_id = session_id;
        this.attendance_code = attendance_code;
        this.tutor_rating = tutor_rating;
        this.registration_number = registration_number;
        this.attendance_confirmed = attendance_confirmed;
    }
    public Long getAttendance_id() {
        return attendance_id;
    }
    public void setAttendance_id(Long attendance_id) {
        this.attendance_id = attendance_id;
    }
    public int getLearner_id() {
        return learner_id;
    }
    public void setLearner_id(int learner_id) {
        this.learner_id = learner_id;
    }
    public int getClass_id() {
        return class_id;
    }
    public void setClass_id(int class_id) {
        this.class_id = class_id;
    }
    public String getExercise_score() {
        return exercise_score;
    }
    public void setExercise_score(String exercise_score) {
        this.exercise_score = exercise_score;
    }
    public String getTutor_remark() {
        return tutor_remark;
    }
    public void setTutor_remark(String tutor_remark) {
        this.tutor_remark = tutor_remark;
    }
    public int getSession_id() {
        return session_id;
    }
    public void setSession_id(int session_id) {
        this.session_id = session_id;
    }
    public String getAttendance_code() {
        return attendance_code;
    }
    public void setAttendance_code(String attendance_code) {
        this.attendance_code = attendance_code;
    }
    public int getTutor_rating() {
        return tutor_rating;
    }
    public void setTutor_rating(int tutor_rating) {
        this.tutor_rating = tutor_rating;
    }
    public String getRegistration_number() {
        return registration_number;
    }
    public void setRegistration_number(String registration_number) {
        this.registration_number = registration_number;
    }
    public int getAttendance_confirmed() {
        return attendance_confirmed;
    }
    public void setAttendance_confirmed(int attendance_confirmed) {
        this.attendance_confirmed = attendance_confirmed;
    }

}
