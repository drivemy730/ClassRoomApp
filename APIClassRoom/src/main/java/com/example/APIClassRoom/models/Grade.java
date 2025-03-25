package com.example.APIClassRoom.models;

import jakarta.persistence.Entity;

import java.util.Date;
import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity

public class Grade
{




    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_grade")
    private Integer gradeId;

    @Column( name = "id_student", nullable = false)
    private Integer studentId; //FK

    @Column( name = "id_subject", nullable = false)
    private Integer subjectId;

    @Column( name = "student_evaluation_result", nullable = false)
    private Float studentEvaluationResult;

    @Column( name = "exam_date", nullable = false)
    private Date examDate;

    //RELATIONS//

    //relation with Student
    @ManyToOne
    @JoinColumn(name="fk_student", referencedColumnName = "id_student")
    @JsonBackReference
    Student student;

    //relation with subject
    @ManyToOne
    @JoinColumn(name="fk_subject", referencedColumnName = "id_subject")
    @JsonBackReference
    Subject subject;


    //Constructors

    public Grade() {
    }

    public Grade(Integer gradeId, Integer studentId, Integer subjectId, Float studentEvaluationResult, Date examDate) {
        this.gradeId = gradeId;
        this.studentId = studentId;
        this.subjectId = subjectId;
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

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
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
