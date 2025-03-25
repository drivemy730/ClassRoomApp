package com.example.APIClassRoom.models;

import com.example.APIClassRoom.helpers.UserType;
import jakarta.persistence.Entity;
import jakarta.persistence.*;
import java.util.*;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Teacher
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "id_teacher")
    private Integer teacherId;

    @Column( name = "id_user", nullable = false)
    private Integer userId; //FK

    @Column( length = 100, nullable = false)
    private String teacherSpecialty;

    // Relationship with course

    @OneToMany(mappedBy = "teacher")
    @JsonManagedReference
    private List<Course> courseList;



    //Constructor

    public Teacher() {
    }

    public Teacher(Integer teacherId, Integer userId, String teacherSpecialty) {
        this.teacherId = teacherId;
        this.userId = userId;
        this.teacherSpecialty = teacherSpecialty;
    }



    //Getter and setters

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getTeacherSpecialty() {
        return teacherSpecialty;
    }

    public void setTeacherSpecialty(String teacherSpecialty) {
        this.teacherSpecialty = teacherSpecialty;
    }

}
