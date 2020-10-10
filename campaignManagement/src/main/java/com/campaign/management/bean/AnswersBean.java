package com.campaign.management.bean;

import javax.persistence.*;

@Entity
@Table(name="surveyquestions")
public class AnswersBean {
    @Id
    @GeneratedValue
    @Column
    private int objid;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="objid")
    private SurveyQuestionsBean surveyQuestionsBean;

    @Column
    private String answerType;
    @Column
    private String answer;

    public AnswersBean() {
    }

    public AnswersBean(int objid, SurveyQuestionsBean surveyQuestionsBean, String answerType, String answer) {
        this.objid = objid;
        this.surveyQuestionsBean = surveyQuestionsBean;
        this.answerType = answerType;
        this.answer = answer;
    }

    public int getObjid() {
        return objid;
    }

    public void setObjid(int objid) {
        this.objid = objid;
    }

    public SurveyQuestionsBean getSurveyQuestionsBean() {
        return surveyQuestionsBean;
    }

    public void setSurveyQuestionsBean(SurveyQuestionsBean surveyQuestionsBean) {
        this.surveyQuestionsBean = surveyQuestionsBean;
    }

    public String getAnswerType() {
        return answerType;
    }

    public void setAnswerType(String answerType) {
        this.answerType = answerType;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
