package com.campaign.management.bean;

import javax.persistence.*;

@Entity
@Table(name="surveylist")
public class SurveyListBean {

    @Id
    @GeneratedValue
    @Column
    private int objid;
    @Column
    private String title;
    @Column
    private String url;
    @Column
    private int isActive;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="emailId")
    private AdminBean adminBean;

    public SurveyListBean() {
    }

    public SurveyListBean(int objid, String title, String url, int isActive, AdminBean adminBean) {
        this.objid = objid;
        this.title = title;
        this.url = url;
        this.isActive = isActive;
        this.adminBean = adminBean;
    }

    public int getObjid() {
        return objid;
    }

    public void setObjid(int objid) {
        this.objid = objid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getIsActive() {
        return isActive;
    }

    public void setIsActive(int isActive) {
        this.isActive = isActive;
    }

    public AdminBean getAdminBean() {
        return adminBean;
    }

    public void setAdminBean(AdminBean adminBean) {
        this.adminBean = adminBean;
    }
}
