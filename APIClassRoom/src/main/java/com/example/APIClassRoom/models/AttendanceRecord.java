package com.example.APIClassRoom.models;

import com.example.APIClassRoom.helpers.AttendanceRecordState;
import jakarta.persistence.Entity;
import com.fasterxml.jackson.annotation.JsonManagedReference; 
import java.util.List;
import java.util.Date;
import jakarta.persistence.*;



@Entity
public class AttendanceRecord
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_attendance")
    private Integer attendanceId;

    @Column( name = "id_student", nullable = false)
    private Integer studentId; //FK

    @Column( name = "id_course", nullable = false)
    private Integer courseId; //FK

    @Column( name = "attendance_date", nullable = false)
    private Date attendanceDate;

    @Column( nullable  = false)
    @Enumerated(EnumType.STRING) // usé esta anotacion para que JPA traiga el string de la clase y no su posicion.
    private AttendanceRecordState attendanceRecordState;

    //RELATIONS

    //Relatioship with course
    @ManyToOne
    @JoinColumn(name="fk_course", referencedColumnName = "id_course")
    @JsonBackReference
    Course course;

    //Relatioship with student
    @ManyToOne
    @JoinColumn(name="fk_student", referencedColumnName = "id_student")
    @JsonBackReference
    Student student;

    //Constructor
    public AttendanceRecord()
    {
    }


    public AttendanceRecord(Integer attendanceId, Integer studentId, Integer courseId, AttendanceRecordState attendanceRecordState ) {
        this.attendanceId = attendanceId;
        this.studentId = studentId;
        this.courseId = courseId;
        this.attendanceRecordState = attendanceRecordState;
    }


    //Getters and setters

    public Integer getAttendanceId() {
        return attendanceId;
    }

    public void setAttendanceId(Integer attendanceId) {
        this.attendanceId = attendanceId;
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

    public Date getAttendanceDate() {
        return attendanceDate;
    }

    public void setAttendanceDate(Date attendanceDate) {
        this.attendanceDate = attendanceDate;
    }


    public AttendanceRecordState getAttendanceRecordState() {
        return attendanceRecordState;
    }

    public void setAttendanceRecordState(AttendanceRecordState attendanceRecordState) {
        this.attendanceRecordState = attendanceRecordState;
    }






}








