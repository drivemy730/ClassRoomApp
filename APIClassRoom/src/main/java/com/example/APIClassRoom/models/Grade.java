package com.example.APIClassRoom.models;

import jakarta.persistence.Entity;

import java.util.Date;

@Entity

public class Grade
{


    private Integer gradeId;

    private Integer studentId;

    private Integer courseId;

    private Float grade;

    private Date examDate;


    //Constructors

    public Grade() {
    }

    public Grade(Integer gradeId, Integer studentId, Integer courseId, Float grade, Date examDate) {
        this.gradeId = gradeId;
        this.studentId = studentId;
        this.courseId = courseId;
        this.grade = grade;
        this.examDate = examDate;
    }




    //Getter and setter


    public Integer getGradeId() {
        return gradeId;
    }

    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
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

    public Float getGrade() {
        return grade;
    }

    public void setGrade(Float grade) {
        this.grade = grade;
    }

    public Date getExamDate() {
        return examDate;
    }

    public void setExamDate(Date examDate) {
        this.examDate = examDate;
    }






}
