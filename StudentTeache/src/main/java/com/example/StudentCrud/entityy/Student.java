package com.example.StudentCrud.entityy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "student")
@Entity
public class Student {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)

    private Long id;
    private String studentname;
    private String course;
    private int fees;
public Student() {
 
}
public Student(Long id, String studentname, String course, int fee) {
this.id = id;
this.studentname = studentname;
this.course = course;
this.fees = fees;
}
public Long getId() {
return id;
}
public void setId(Long id) {
this.id = id;
}
public String getStudentname() {
return studentname;
}
public void setStudentname(String studentname) {
this.studentname = studentname;
}
public String getCourse() {
return course;
}
public void setCourse(String course) {
this.course = course;
}
public int getFees() {
return fees;
}
public void setFees(int fees) {
this.fees = fees;
}
 
}
