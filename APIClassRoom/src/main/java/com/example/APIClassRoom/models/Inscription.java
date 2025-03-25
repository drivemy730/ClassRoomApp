package com.example.APIClassRoom.models;

import com.example.APIClassRoom.helpers.UserType;
import jakarta.persistence.Entity;

import java.sql.Timestamp;
import java.util.Date;
import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonBackReference;



@Entity
public class Inscription
{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "id_inscription")
    private Integer inscriptionId;


    @Column( name = "id_student", nullable = false)
    private Integer studentId; //FK

    @Column( name = "id_course", nullable = false)
    private Integer courseId; //FK

    @Column( name = "inscription_date", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date inscriptionDate;


    //RELATIONS

    // relationship with Course
    @ManyToOne
    @JoinColumn(name="fk_course", referencedColumnName = "id_course")
    @JsonBackReference
    Course course;

    // relationship with student
    @ManyToOne
    @JoinColumn(name="fk_student", referencedColumnName = "id_student")
    @JsonBackReference
    Student student;


    //Constructors

    public Inscription() {
    }

    public Inscription(Integer inscriptionId, Integer studentId, Integer courseId, Date inscriptionDate) {
        this.inscriptionId = inscriptionId;
        this.studentId = studentId;
        this.courseId = courseId;
        this.inscriptionDate = inscriptionDate;
    }


   //Getters and setters

    public Integer getInscriptionId() {
        return inscriptionId;
    }

    public void setInscriptionId(Integer inscriptionId) {
        this.inscriptionId = inscriptionId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Date getInscriptionDate() {
        return inscriptionDate;
    }

    public void setInscriptionDate(Date inscriptionDate) {
        this.inscriptionDate = inscriptionDate;
    }









}
