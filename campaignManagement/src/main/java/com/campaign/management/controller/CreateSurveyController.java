package com.campaign.management.controller;

import com.campaign.management.bean.SurveyListBean;
import com.campaign.management.bean.SurveyQuestionsBean;
import com.campaign.management.service.CreateQuestionsService;
import com.campaign.management.service.CreateSurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
@SessionAttributes({"surveyId"})
public class CreateSurveyController {

    @Autowired
    CreateSurveyService createSurveyService;
    @Autowired
    CreateQuestionsService createQuestionsService;
    String question;
    String answerType;
    int count=0;
    @RequestMapping(value="/newSurvey",method= RequestMethod.POST )
    public ModelAndView createSurvey(@ModelAttribute("newSurvey")SurveyListBean bean, HttpSession session) throws IOException {

        int response = createSurveyService.createSurvey(bean);
        System.out.println(response);
        if(response!=-1) {
            session.setAttribute("surveyId",response);
            return new ModelAndView("addQuestion", "command", new SurveyQuestionsBean());
        }
        else
            return new ModelAndView("error", "command", new SurveyListBean());
    }

    @RequestMapping(value="/addQuestion",method= RequestMethod.POST )
    public ModelAndView addQuestion(@ModelAttribute("addQuestion")SurveyQuestionsBean bean)
    {
        bean.setQuestion(bean.getQuestion());
        bean.setAnswerType(bean.getAnswerType());
        bean.setOption1(bean.getOption1());
        bean.setOption1(bean.getOption2());
        bean.setOption1(bean.getOption3());
        bean.setOption1(bean.getOption4());
        boolean result=createQuestionsService.createQuestion(
                bean.getQuestion(),bean.getAnswerType(),bean.getOption1(),bean.getOption2(),
                bean.getOption3(),bean.getOption4());
        if(result==true)
        {
            count++;
            if(count<6)
                return new ModelAndView("addQuestion");
            else
                return new ModelAndView("createSurvey");
        }
        else
            return new ModelAndView("error");



    }

}
