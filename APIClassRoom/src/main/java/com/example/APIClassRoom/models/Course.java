package com.example.APIClassRoom.models;

import com.example.APIClassRoom.helpers.UserType;
import jakarta.persistence.Entity;
import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.util.List;


@Entity
public class Course
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "id_course")
    private Integer courseId;

    @Column( name = "course_name", length = 100, nullable = false)
    private String courseName;

    @Column( name = "id_teacher", nullable = false)
    private Integer teacherId; //FK

    //RELATIONS

    //Relationship with Teacher
    @ManyToOne
    @JoinColumn(name="fk_teacher", referencedColumnName = "id_teacher")
    @JsonBackReference
    Teacher teacher;

    // relationship with Subject
    @OneToMany(mappedBy = "course")
    @JsonManagedReference
    private List<Subject> subjectList;

    // relationship with inscription
    @OneToMany(mappedBy = "course")
    @JsonManagedReference
    private List<Inscription> inscriptionList;

    // relationship with attendance
    @OneToMany(mappedBy = "course")
    @JsonManagedReference
    private List<AttendanceRecord> attendanceRecordList;






    //Constructor
    public Course() {
    }

    public Course(Integer courseId, String courseName, Integer teacherId) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.teacherId = teacherId;
    }




    //Getters and setters

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }




}
