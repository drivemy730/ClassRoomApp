package com.example.APIClassRoom.models;

import com.example.APIClassRoom.helpers.AttendanceRecordState;
import jakarta.persistence.Entity;

import java.util.Date;



@Entity
public class AttendanceRecord
{


    private Integer attendanceId;

    private Integer studentId;

    private Integer courseId;

    private Date attendanceDate;



    private AttendanceRecordState attendanceRecordState;


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








