package com.timothyisaiah.resultsapiportal.entity.campus;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;


@Entity
@Table(schema = "everestg_campus_kayiwa", name = "student_class_allocation")
public class Student_class_allocation {
    @Id
    private Integer allocation_id;
  private Integer class_id;
  private Integer learner_id;
  private Date date_created;
public Student_class_allocation(Integer allocation_id, Integer class_id, Integer learner_id, Date date_created) {
    this.allocation_id = allocation_id;
    this.class_id = class_id;
    this.learner_id = learner_id;
    this.date_created = date_created;
}
public Integer getAllocation_id() {
    return allocation_id;
}
public void setAllocation_id(Integer allocation_id) {
    this.allocation_id = allocation_id;
}
public Integer getClass_id() {
    return class_id;
}
public void setClass_id(Integer class_id) {
    this.class_id = class_id;
}
public Integer getLearner_id() {
    return learner_id;
}
public void setLearner_id(Integer learner_id) {
    this.learner_id = learner_id;
}
public Date getDate_created() {
    return date_created;
}
public void setDate_created(Date date_created) {
    this.date_created = date_created;
}
    
}
