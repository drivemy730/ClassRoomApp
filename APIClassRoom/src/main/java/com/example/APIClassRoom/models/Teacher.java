package com.example.APIClassRoom.models;

import com.example.APIClassRoom.helpers.UserType;
import jakarta.persistence.Entity;
import jakarta.persistence.*;


@Entity
public class Teacher
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "id_teacher")
    private Integer teacherId;

    @Column( name = "id_user", nullable = false)
    private Integer userId;

    @Column( length = 100, nullable = false)
    private String teacherSpecialty;


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
