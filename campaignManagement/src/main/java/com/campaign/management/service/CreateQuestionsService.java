package com.campaign.management.service;

import com.campaign.management.bean.SurveyQuestionsBean;
import com.campaign.management.repository.CreateQuestionsRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CreateQuestionsService {
    @Autowired
    CreateQuestionsRepository createQuestionsRepository;

    public boolean createQuestion(String question, String answerType,String options)
    {
        SurveyQuestionsBean out=createQuestionsRepository.saveAndFlush(new SurveyQuestionsBean(question,answerType,options));
        if(null==out)
            return false;
        else
            return true;
    }

}
