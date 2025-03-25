package com.example.APIClassRoom.models;


import jakarta.persistence.Entity;

@Entity
public class Subject
{




    private Integer subjectId;

    private String subjectName;

    private Integer courseId;




    //Constructors

    public Subject() {
    }

    public Subject(Integer subjectId, String subjectName, Integer courseId) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.courseId = courseId;
    }




    //Getters and setters

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }




}
