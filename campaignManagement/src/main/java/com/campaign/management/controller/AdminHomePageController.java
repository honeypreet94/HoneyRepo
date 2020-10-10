package com.campaign.management.controller;

import com.campaign.management.bean.AdminBean;
import com.campaign.management.bean.SurveyListBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class AdminHomePageController {

    @RequestMapping(value="/createSurvey" )
    public ModelAndView loginPage(HttpServletResponse response) throws IOException {
        return new ModelAndView("createSurvey","command",new SurveyListBean());
    }

}
