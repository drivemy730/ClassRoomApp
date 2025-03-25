package com.example.APIClassRoom.models;


import jakarta.persistence.Entity;
import jakarta.persistence.*;


@Entity
public class Subject
{



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_subject")
    private Integer subjectId;

    @Column( name = "subject_name", length = 100, nullable = false)
    private String subjectName;

    @Column( name = "id_course", nullable = false)
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
