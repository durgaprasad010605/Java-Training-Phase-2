package com.student.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

    @Id
    private int stdId;

    private String stdName;
    private String stdBranch;
    private String stdEmail;
    private String stdContact;
    private double stdFees;

    public Student() {
    }

    public Student(int stdId, String stdName, String stdBranch,String stdEmail, String stdContact, double stdFees) {
        this.stdId = stdId;
        this.stdName = stdName;
        this.stdBranch = stdBranch;
        this.stdEmail = stdEmail;
        this.stdContact = stdContact;
        this.stdFees = stdFees;
    }

    public int getStdId() {
        return stdId;
    }

    public void setStdId(int stdId) {
        this.stdId = stdId;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public String getStdBranch() {
        return stdBranch;
    }

    public void setStdBranch(String stdBranch) {
        this.stdBranch = stdBranch;
    }

    public String getStdEmail() {
        return stdEmail;
    }

    public void setStdEmail(String stdEmail) {
        this.stdEmail = stdEmail;
    }

    public String getStdContact() {
        return stdContact;
    }

    public void setStdContact(String stdContact) {
        this.stdContact = stdContact;
    }

    public double getStdFees() {
        return stdFees;
    }

    public void setStdFees(double stdFees) {
        this.stdFees = stdFees;
    }
}