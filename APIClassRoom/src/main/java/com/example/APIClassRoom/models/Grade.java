package com.example.APIClassRoom.models;

import jakarta.persistence.Entity;

import java.util.Date;
import jakarta.persistence.*;


@Entity

public class Grade
{




    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_grade")
    private Integer gradeId;

    @Column( name = "id_student", nullable = false)
    private Integer studentId;

    @Column( name = "id_course", nullable = false)
    private Integer courseId;

    @Column( name = "student_evaluation_result", nullable = false)
    private Float studentEvaluationResult;

    @Column( name = "exam_date", nullable = false)
    private Date examDate;


    //Constructors

    public Grade() {
    }

    public Grade(Integer gradeId, Integer studentId, Integer courseId, Float studentEvaluationResult, Date examDate) {
        this.gradeId = gradeId;
        this.studentId = studentId;
        this.courseId = courseId;
        this.studentEvaluationResult = studentEvaluationResult;
        this.examDate = examDate;
    }



    //Getter and setter


    public Integer getGradeId() {
        return gradeId;
    }

    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
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

    public Float getStudentEvaluationResult() {
        return studentEvaluationResult;
    }

    public void setStudentEvaluationResult(Float studentEvaluationResult) {
        this.studentEvaluationResult = studentEvaluationResult;
    }

    public Date getExamDate() {
        return examDate;
    }

    public void setExamDate(Date examDate) {
        this.examDate = examDate;
    }





}

