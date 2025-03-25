package com.example.APIClassRoom.models;

import com.example.APIClassRoom.helpers.UserType;
import jakarta.persistence.Entity;
import jakarta.persistence.*;
import java.util.Date;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;



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

    @Column( name = "student_address", length = 100, nullable = false)
    private String studentAddress;

    //RELATIONS//

    // relationship with user
    @ManyToOne
    @JoinColumn(name="fk_user", referencedColumnName = "id_user")
    @JsonBackReference
    User user;

    // relationship with grade
    @OneToMany(mappedBy = "student")
    @JsonManagedReference
    private List<Grade> gradeList;

    // relationship with attendance
    @OneToMany(mappedBy = "student")
    @JsonManagedReference
    private List<AttendanceRecord> attendanceRecordList;

    // relationship with scription
    @OneToMany(mappedBy = "student")
    @JsonManagedReference
    private List<Inscription> inscriptionList;


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
