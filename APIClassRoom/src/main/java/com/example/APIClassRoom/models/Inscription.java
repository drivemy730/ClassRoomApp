package com.example.APIClassRoom.models;

import com.example.APIClassRoom.helpers.UserType;
import jakarta.persistence.Entity;

import java.sql.Timestamp;
import java.util.Date;


@Entity
public class Inscription
{


    private Integer inscriptionId;

    private Integer studentId;

    private String courseId;

    private String password;

   private Date inscriptionDate;

   //Constructors
   public Inscription() {
   }

    public Inscription(Integer inscriptionId, Integer studentId, String courseId, String password, Date inscriptionDate) {
        this.inscriptionId = inscriptionId;
        this.studentId = studentId;
        this.courseId = courseId;
        this.password = password;
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

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getInscriptionDate() {
        return inscriptionDate;
    }

    public void setInscriptionDate(Date inscriptionDate) {
        this.inscriptionDate = inscriptionDate;
    }





}
