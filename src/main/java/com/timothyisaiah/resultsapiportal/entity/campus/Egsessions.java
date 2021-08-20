package com.timothyisaiah.resultsapiportal.entity.campus;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "everestg_campus_kayiwa", name = "egsessions")
public class Egsessions {
    @Id
    private Integer session_id;
    private Integer learner_id;
    private Integer tutor_id;
    private Integer subject_id;
    private String session_day;
    private String start_month;
    private Date date_created;
    private Date session_dates;
    private Float expected_duration;
    private Float actual_duration;
    private String topic;
    private String sub_topic;
    private String tutor_remark;
    private String offline_resources;
    private String online_resources;
    private String exercise_score;
    private String test_score;
    private String exercise_file;
    private String learner_remark;
    private String billing_type;
    private Integer tutor_rate;
    private Integer parent_rate;
    private Integer tutor_expected_income;
    private Integer parent_expected_bill;
    private Integer tutor_actual_income;
    private Integer parent_actual_bill;
    private Integer parent_id;
    private String parent_comment;
    private Integer completed_session;
    private Integer tutor_created_session;
    private String locked;
    private Integer transfered_to;
    private Integer transfered_from;
    private Integer class_id;

    public Egsessions() {
    }

    public Egsessions(Integer session_id, Integer learner_id, Integer tutor_id, Integer subject_id, String session_day,
            String start_month, Date date_created, Date session_dates, Float expected_duration,
            Float actual_duration, String topic, String sub_topic, String tutor_remark, String offline_resources,
            String online_resources, String exercise_score, String test_score, String exercise_file,
            String learner_remark, String billing_type, Integer tutor_rate, Integer parent_rate,
            Integer tutor_expected_income, Integer parent_expected_bill, Integer tutor_actual_income,
            Integer parent_actual_bill, Integer parent_id, String parent_comment, Integer completed_session,
            Integer tutor_created_session, String locked, Integer transfered_to, Integer transfered_from,
            Integer class_id) {
        this.session_id = session_id;
        this.learner_id = learner_id;
        this.tutor_id = tutor_id;
        this.subject_id = subject_id;
        this.session_day = session_day;
        this.start_month = start_month;
        this.date_created = date_created;
        this.session_dates = session_dates;
        this.expected_duration = expected_duration;
        this.actual_duration = actual_duration;
        this.topic = topic;
        this.sub_topic = sub_topic;
        this.tutor_remark = tutor_remark;
        this.offline_resources = offline_resources;
        this.online_resources = online_resources;
        this.exercise_score = exercise_score;
        this.test_score = test_score;
        this.exercise_file = exercise_file;
        this.learner_remark = learner_remark;
        this.billing_type = billing_type;
        this.tutor_rate = tutor_rate;
        this.parent_rate = parent_rate;
        this.tutor_expected_income = tutor_expected_income;
        this.parent_expected_bill = parent_expected_bill;
        this.tutor_actual_income = tutor_actual_income;
        this.parent_actual_bill = parent_actual_bill;
        this.parent_id = parent_id;
        this.parent_comment = parent_comment;
        this.completed_session = completed_session;
        this.tutor_created_session = tutor_created_session;
        this.locked = locked;
        this.transfered_to = transfered_to;
        this.transfered_from = transfered_from;
        this.class_id = class_id;
    }

    public Integer getSession_id() {
        return session_id;
    }

    public void setSession_id(Integer session_id) {
        this.session_id = session_id;
    }

    public Integer getLearner_id() {
        return learner_id;
    }

    public void setLearner_id(Integer learner_id) {
        this.learner_id = learner_id;
    }

    public Integer getTutor_id() {
        return tutor_id;
    }

    public void setTutor_id(Integer tutor_id) {
        this.tutor_id = tutor_id;
    }

    public Integer getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(Integer subject_id) {
        this.subject_id = subject_id;
    }

    public String getSession_day() {
        return session_day;
    }

    public void setSession_day(String session_day) {
        this.session_day = session_day;
    }

    public String getStart_month() {
        return start_month;
    }

    public void setStart_month(String start_month) {
        this.start_month = start_month;
    }

    public Date getDate_created() {
        return date_created;
    }

    public void setDate_created(Date date_created) {
        this.date_created = date_created;
    }

    public Date getSession_dates() {
        return session_dates;
    }

    public void setSession_dates(Date session_dates) {
        this.session_dates = session_dates;
    }

    public Float getExpected_duration() {
        return expected_duration;
    }

    public void setExpected_duration(Float expected_duration) {
        this.expected_duration = expected_duration;
    }

    public Float getActual_duration() {
        return actual_duration;
    }

    public void setActual_duration(Float actual_duration) {
        this.actual_duration = actual_duration;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getSub_topic() {
        return sub_topic;
    }

    public void setSub_topic(String sub_topic) {
        this.sub_topic = sub_topic;
    }

    public String getTutor_remark() {
        return tutor_remark;
    }

    public void setTutor_remark(String tutor_remark) {
        this.tutor_remark = tutor_remark;
    }

    public String getOffline_resources() {
        return offline_resources;
    }

    public void setOffline_resources(String offline_resources) {
        this.offline_resources = offline_resources;
    }

    public String getOnline_resources() {
        return online_resources;
    }

    public void setOnline_resources(String online_resources) {
        this.online_resources = online_resources;
    }

    public String getExercise_score() {
        return exercise_score;
    }

    public void setExercise_score(String exercise_score) {
        this.exercise_score = exercise_score;
    }

    public String getTest_score() {
        return test_score;
    }

    public void setTest_score(String test_score) {
        this.test_score = test_score;
    }

    public String getExercise_file() {
        return exercise_file;
    }

    public void setExercise_file(String exercise_file) {
        this.exercise_file = exercise_file;
    }

    public String getLearner_remark() {
        return learner_remark;
    }

    public void setLearner_remark(String learner_remark) {
        this.learner_remark = learner_remark;
    }

    public String getBilling_type() {
        return billing_type;
    }

    public void setBilling_type(String billing_type) {
        this.billing_type = billing_type;
    }

    public Integer getTutor_rate() {
        return tutor_rate;
    }

    public void setTutor_rate(Integer tutor_rate) {
        this.tutor_rate = tutor_rate;
    }

    public Integer getParent_rate() {
        return parent_rate;
    }

    public void setParent_rate(Integer parent_rate) {
        this.parent_rate = parent_rate;
    }

    public Integer getTutor_expected_income() {
        return tutor_expected_income;
    }

    public void setTutor_expected_income(Integer tutor_expected_income) {
        this.tutor_expected_income = tutor_expected_income;
    }

    public Integer getParent_expected_bill() {
        return parent_expected_bill;
    }

    public void setParent_expected_bill(Integer parent_expected_bill) {
        this.parent_expected_bill = parent_expected_bill;
    }

    public Integer getTutor_actual_income() {
        return tutor_actual_income;
    }

    public void setTutor_actual_income(Integer tutor_actual_income) {
        this.tutor_actual_income = tutor_actual_income;
    }

    public Integer getParent_actual_bill() {
        return parent_actual_bill;
    }

    public void setParent_actual_bill(Integer parent_actual_bill) {
        this.parent_actual_bill = parent_actual_bill;
    }

    public Integer getParent_id() {
        return parent_id;
    }

    public void setParent_id(Integer parent_id) {
        this.parent_id = parent_id;
    }

    public String getParent_comment() {
        return parent_comment;
    }

    public void setParent_comment(String parent_comment) {
        this.parent_comment = parent_comment;
    }

    public Integer getCompleted_session() {
        return completed_session;
    }

    public void setCompleted_session(Integer completed_session) {
        this.completed_session = completed_session;
    }

    public Integer getTutor_created_session() {
        return tutor_created_session;
    }

    public void setTutor_created_session(Integer tutor_created_session) {
        this.tutor_created_session = tutor_created_session;
    }

    public String getLocked() {
        return locked;
    }

    public void setLocked(String locked) {
        this.locked = locked;
    }

    public Integer getTransfered_to() {
        return transfered_to;
    }

    public void setTransfered_to(Integer transfered_to) {
        this.transfered_to = transfered_to;
    }

    public Integer getTransfered_from() {
        return transfered_from;
    }

    public void setTransfered_from(Integer transfered_from) {
        this.transfered_from = transfered_from;
    }

    public Integer getClass_id() {
        return class_id;
    }

    public void setClass_id(Integer class_id) {
        this.class_id = class_id;
    }

   
}
