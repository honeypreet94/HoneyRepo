package com.online.assessment.onlineAssessment;

import com.online.assessment.bean.UserBean;
import com.online.assessment.service.UserService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Controller
@SessionAttributes({"userType"})
public class HomeController {

    @Autowired
    UserService userService;
    /*@RequestMapping("home")
    public String home()
    {
        return "home";
    }*/

    @RequestMapping(value="/home" )
    public ModelAndView home(HttpServletResponse response) throws IOException {
        return new ModelAndView("home","command",new UserBean());
    }

    @RequestMapping(value="/login" ,method= RequestMethod.POST)

    public ModelAndView login(@ModelAttribute("home")UserBean bean, HttpSession session)
    {

       boolean result=userService.login(bean.getEmailId(),bean.getPassword());

       String type=userService.getType();

        if(result==true)
        {
            boolean value= sessionBegin(session,type);
            if(value==true)
            return  new ModelAndView("success");
            else
                return new ModelAndView("successCandidate");
        }


        return new ModelAndView("failure");

    }

    @RequestMapping(value="/register")
    public ModelAndView register()
    {
        return new ModelAndView("register","command",new UserBean());
    }
    @RequestMapping(value="/registerpage" ,method= RequestMethod.POST)
    public ModelAndView registerPage(@ModelAttribute("home")UserBean bean, ModelMap model)
    {
        boolean result=userService.registerPage(bean);
        if(result== true)
        {
            model.addAttribute("first",bean.getFirstName());
            //model.addAttribute("last",bean.getLastName());
            return new ModelAndView("registersuccess");
        }
        return new ModelAndView("registerfailure");
    }

    public boolean sessionBegin(HttpSession session, String type)
    {
            session.setAttribute("userType",type);
            String user=(String)session.getAttribute("userType");
            if(user=="admin")
                return true;
            else
                return false;

    }

    @RequestMapping("/logout")
    public ModelAndView logout(HttpSession session)
    {
        session.invalidate();
        return new ModelAndView("home");
    }

    @RequestMapping(value="/candidatelist")
    public ModelAndView candidateList()
    {
        List<UserBean> userlist=userService.userList();
        List<String> list=new ArrayList<>();
        Iterator<UserBean> itr=userlist.iterator();
        while(itr.hasNext())
        {
            UserBean bean=itr.next();
            list.add(bean.getFirstName()+"," +bean.getLastName()+","+bean.getEmailId()+","+bean.getUserType());
        }
        ModelAndView view=new ModelAndView("candidatelist");
        view.addObject("list",list);
        return view;
    }

    @RequestMapping(value="/testlist")
    public void testList()
    {

    }
    @RequestMapping(value="/spring")
    public void spring(
            @RequestParam("answer1") String answer1,@RequestParam("answer2") String answer2,
            @RequestParam("answer3") String answer3,@RequestParam("answer4") String answer4,
            @RequestParam("answer2") String answer5)
    {
       /* int score=0;
        if(answer1 selected)
            score=+10;
        if(answer2 selected)*/

    }

    @RequestMapping(value="/hibernate")
    public void hibernate()
    {

    }

}
