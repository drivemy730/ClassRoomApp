package com.example.APIClassRoom.models;

import com.example.APIClassRoom.helpers.UserType;
import jakarta.persistence.Entity;

@Entity
public class Teacher
{




    private Integer teacherId;

    private Integer userId;

    private String specialty;

    //Constructor
    public Teacher() {
    }

    public Teacher(Integer teacherId, Integer userId, String specialty) {
        this.teacherId = teacherId;
        this.userId = userId;
        this.specialty = specialty;
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

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }


}
