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
        question=bean.getQuestion();

        System.out.println("Question:" + question);
        System.out.println("Answer:" + bean.getAnswerType());
        if("Radio Button".equals(bean.getAnswerType()))
        {
            answerType="Radio Button";
            return new ModelAndView("radioButton" , "command", new SurveyQuestionsBean());
        }
        else if("Checkbox".equals(bean.getAnswerType())) {
            answerType = "Checkbox";
            return new ModelAndView("checkbox", "command", new SurveyQuestionsBean());
        }
        else if("Text Field".equals(bean.getAnswerType()))
        {
            answerType = "Text Field";
            return new ModelAndView("textField", "command", new SurveyQuestionsBean());
        }
        else
            return new ModelAndView("error", "command", new SurveyQuestionsBean());
    }

    @RequestMapping(value="/addAnswer",method= RequestMethod.POST )
    public void addAnswer(@ModelAttribute("addAnswer")SurveyQuestionsBean bean) {

        boolean out= createQuestionsService.createQuestion(question,answerType,bean.getOptions());
        

    }
}
