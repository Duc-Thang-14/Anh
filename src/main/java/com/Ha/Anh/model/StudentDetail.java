package com.Ha.Anh.model;

import jakarta.persistence.*;

@Entity
@Table(name = "student_detail")
public class StudentDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;

    @OneToOne
    @JoinColumn(name = "studentId", referencedColumnName = "studentId")
    private Student student;

    private String studyHistory;
    private String registeredSubjects;
    private String academicResults;

    // Getters and Setters

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getStudyHistory() {
        return studyHistory;
    }

    public void setStudyHistory(String studyHistory) {
        this.studyHistory = studyHistory;
    }

    public String getRegisteredSubjects() {
        return registeredSubjects;
    }

    public void setRegisteredSubjects(String registeredSubjects) {
        this.registeredSubjects = registeredSubjects;
    }

    public String getAcademicResults() {
        return academicResults;
    }

    public void setAcademicResults(String academicResults) {
        this.academicResults = academicResults;
    }
}
