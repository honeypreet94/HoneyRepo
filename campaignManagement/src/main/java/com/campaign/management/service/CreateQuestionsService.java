package com.campaign.management.service;

import com.campaign.management.bean.SurveyQuestionsBean;
import com.campaign.management.repository.CreateQuestionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateQuestionsService {
    @Autowired
    CreateQuestionsRepository createQuestionsRepository;

    public boolean createQuestion(String question, String answerType,String option1, String option2, String option3, String option4)
    {
        SurveyQuestionsBean out=createQuestionsRepository.saveAndFlush(new SurveyQuestionsBean(question,answerType,option1,option2,option3,option4));
        if(null==out)
            return false;
        else
            return true;
    }

}
