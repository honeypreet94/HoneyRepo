package com.online.assessment.bean;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="testresult")
public class Test {
    @Id
    @Column
    @GeneratedValue
    private int id;
    @Column(name="test_date")
    private Date testDate;
    @Column
    private String assessment;
    @Column(name="test_marks")
    private int testMarks;
    @Column(name="email_id")
    private String emailId;
    @Column(name="total_marks")
    private int totalMarks=50;
    @Column
    private String result;

    public Test() {
    }

    public Test(Date testDate, String assessment, int testMarks, String emailId, int totalMarks, String result) {
        this.testDate = testDate;
        this.assessment = assessment;
        this.testMarks = testMarks;
        this.emailId = emailId;
        this.totalMarks = totalMarks;
        this.result = result;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getTestDate() {
        return testDate;
    }

    public void setTestDate(Date testDate) {
        this.testDate = testDate;
    }

    public String getAssessment() {
        return assessment;
    }

    public void setAssessment(String assessment) {
        this.assessment = assessment;
    }

    public int getTestMarks() {
        return testMarks;
    }

    public void setTestMarks(int testMarks) {
        this.testMarks = testMarks;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
