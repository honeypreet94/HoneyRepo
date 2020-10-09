package com.campaign.management.controller;


import com.campaign.management.bean.AdminBean;
import com.campaign.management.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
public class HomeController {

    @Autowired
    AdminService adminService;

    @RequestMapping(value="/loginPage" )
    public ModelAndView loginPage(HttpServletResponse response) throws IOException {
        return new ModelAndView("loginPage","command",new AdminBean());
    }

    @RequestMapping(value="/login" ,method= RequestMethod.POST)

    public ModelAndView login(@ModelAttribute("loginPage")AdminBean bean, HttpSession session)
    {

        String result=adminService.login(bean.getEmailId(),bean.getPassword());

        if("true".equals(result))
        {
           // boolean value= sessionBegin(session,bean.getEmailId());
            //if(value==true)
                return  new ModelAndView("success");

        }
        return new ModelAndView("failure");
    }

}
