package com.example.APIClassRoom.models;

import com.example.APIClassRoom.helpers.UserType;
import jakarta.persistence.Entity;
import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Student
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_student")
    private Integer studentId;

    @Column( name = "id_user", nullable = false)
    private Integer userId;

    @Column( name = "student_academic_year", nullable = false)
    private Integer studentAcademicYear;

    @Column( name = "student_birth_date", nullable = false)
    @Temporal(TemporalType.DATE) // anotacion para guardar traducir solo fecha formato sin hora,min o segundos
    private Date studentBirthDate;

    @Column( name = "student_adress", length = 100, nullable = false)
    private String studentAddress;



    //Constructors

    public Student() {
    }

    public Student(Integer studentId, Integer userId, Integer studentAcademicYear, Date studentBirthDate, String studentAddress) {
        this.studentId = studentId;
        this.userId = userId;
        this.studentAcademicYear = studentAcademicYear;
        this.studentBirthDate = studentBirthDate;
        this.studentAddress = studentAddress;
    }



    //Getter and setters

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getStudentAcademicYear() {
        return studentAcademicYear;
    }

    public void setStudentAcademicYear(Integer studentAcademicYear) {
        this.studentAcademicYear = studentAcademicYear;
    }

    public Date getStudentBirthDate() {
        return studentBirthDate;
    }

    public void setStudentBirthDate(Date studentBirthDate) {
        this.studentBirthDate = studentBirthDate;
    }

    public String getstudentAddress() {
        return studentAddress;
    }

    public void setstudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }




}
