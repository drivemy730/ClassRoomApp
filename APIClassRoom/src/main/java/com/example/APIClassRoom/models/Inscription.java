package com.example.APIClassRoom.models;

import com.example.APIClassRoom.helpers.UserType;
import jakarta.persistence.Entity;

import java.sql.Timestamp;
import java.util.Date;
import jakarta.persistence.*;



@Entity
public class Inscription
{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "id_inscription")
    private Integer inscriptionId;


    @Column( name = "id_student", nullable = false)
    private Integer studentId;

    @Column( name = "id_course", nullable = false)
    private Integer courseId;

    @Column( name = "inscription_date", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date inscriptionDate;



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

