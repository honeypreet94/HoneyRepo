package com.campaign.management.bean;

import javax.persistence.*;

@Entity
@Table(name="surveyquestions")
public class SurveyQuestionsBean {
    @Id
    @GeneratedValue
    @Column
    private int objid;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="objid")
    private SurveyListBean surveyListBean;

    @Column
    private String question;
    @Column
    private String answerType;
    @Column
    private String options;

    public SurveyQuestionsBean() {
    }

    public SurveyQuestionsBean(int objid, SurveyListBean surveyListBean, String question, String answerType, String options) {
        this.objid = objid;
        this.surveyListBean = surveyListBean;
        this.question = question;
        this.answerType = answerType;
        this.options = options;
    }

    public int getObjid() {
        return objid;
    }

    public void setObjid(int objid) {
        this.objid = objid;
    }

    public SurveyListBean getSurveyListBean() {
        return surveyListBean;
    }

    public void setSurveyListBean(SurveyListBean surveyListBean) {
        this.surveyListBean = surveyListBean;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswerType() {
        return answerType;
    }

    public void setAnswerType(String answerType) {
        this.answerType = answerType;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }
}
