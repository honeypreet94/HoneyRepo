package com.campaign.management.bean;

import javax.persistence.*;

@Entity
@Table(name="adminBean")

public class AdminBean {

    @Id
    @Column
    @GeneratedValue
    private int id;
    @Column
    private String emailId;
    @Column
    private String password;

    public AdminBean() {
    }

    public AdminBean(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
