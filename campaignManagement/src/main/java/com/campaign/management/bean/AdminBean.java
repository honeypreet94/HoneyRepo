package com.campaign.management.bean;

import javax.persistence.*;

@Entity
@Table(name="adminBean")

public class AdminBean {

    @Column(name="objid")
    @GeneratedValue
    private int objId;
    @Id
    @Column
    private String email_id;
    @Column
    private String password;

    public AdminBean() {
    }

    public AdminBean(String email_id, String password) {
        this.email_id = email_id;
        this.password = password;
    }

    public int getObjId() {
        return objId;
    }

    public void setObjId(int objIid) {
        this.objId = objIid;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
