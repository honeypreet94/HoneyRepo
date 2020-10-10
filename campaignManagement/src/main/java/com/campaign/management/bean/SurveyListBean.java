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
    private String description;
    @Column
    private String url;
    @Column
    private int is_active;
    @Column
    private int finished;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="email_id")
    private AdminBean adminBean;

    public SurveyListBean() {
    }

    public SurveyListBean(int objid, String title,String description, String url, int is_active,int finished, AdminBean adminBean) {
        this.objid = objid;
        this.title = title;
        this.description=description;
        this.url = url;
        this.is_active = is_active;
        this.finished=finished;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public int getIs_active() {
        return is_active;
    }

    public void setIs_active(int is_active) {
        this.is_active = is_active;
    }

    public int getFinished() {
        return finished;
    }

    public void setFinished(int finished) {
        this.finished = finished;
    }

    public AdminBean getAdminBean() {
        return adminBean;
    }

    public void setAdminBean(AdminBean adminBean) {
        this.adminBean = adminBean;
    }
}
