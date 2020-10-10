package com.campaign.management.bean;

import javax.persistence.*;

@Entity
@Table(name="adminBean")

public class AdminBean {

    @Column
    @GeneratedValue
    private int objId;
    @Id
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

    public AdminBean(int id,String emailId, String password) {
        this.objId=id;
        this.emailId = emailId;
        this.password = password;
    }

    public int getObjId() {
        return objId;
    }

    public void setObjId(int objIid) {
        this.objId = objIid;
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
