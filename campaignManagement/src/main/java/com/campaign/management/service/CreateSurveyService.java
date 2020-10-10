package com.campaign.management.service;

import com.campaign.management.bean.SurveyListBean;
import com.campaign.management.bean.SurveyQuestionsBean;
import com.campaign.management.repository.CreateSurveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class CreateSurveyService {

    @Autowired
    CreateSurveyRepository createSurveyRepository;

    public int createSurvey(SurveyListBean bean){
        String url=generateUrl();
        bean.setUrl(url);
        SurveyListBean out = createSurveyRepository.saveAndFlush(bean);
        if(out==null)
            return -1;
        else
            return out.getObjid();
    }

    public String generateUrl() {
        int leftLimit = 48; // numeral '0'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        return generatedString;
    }



}
