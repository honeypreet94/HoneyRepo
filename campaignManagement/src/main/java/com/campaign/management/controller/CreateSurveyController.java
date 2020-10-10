package com.campaign.management.controller;

import com.campaign.management.bean.SurveyListBean;
import com.campaign.management.bean.SurveyQuestionsBean;
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

}
