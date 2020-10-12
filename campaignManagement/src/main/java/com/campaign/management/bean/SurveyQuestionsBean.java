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
    private String option1;
    @Column
    private String option2;
    @Column
    private String option3;
    @Column
    private String option4;


    public SurveyQuestionsBean() {
    }

    public SurveyQuestionsBean(int objid, SurveyListBean surveyListBean, String question, String answerType, String option1,String option2,String option3,String option4) {
        this.objid = objid;
        this.surveyListBean = surveyListBean;
        this.question = question;
        this.answerType = answerType;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
    }

    public SurveyQuestionsBean(String question, String answerType, String option1, String option2, String option3, String option4) {
        this.question = question;
        this.answerType = answerType;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
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

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public String getOption3() {
        return option3;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }

    public String getOption4() {
        return option4;
    }

    public void setOption4(String option4) {
        this.option4 = option4;
    }
}
