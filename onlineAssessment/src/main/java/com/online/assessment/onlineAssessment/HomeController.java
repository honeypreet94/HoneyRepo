package com.online.assessment.onlineAssessment;

import com.online.assessment.bean.Question;
import com.online.assessment.bean.Test;
import com.online.assessment.bean.UserBean;
import com.online.assessment.service.TestService;
import com.online.assessment.service.UserService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Controller
@SessionAttributes({"userType"})
public class HomeController {

    @Autowired
    UserService userService;

    @Autowired
    TestService testService;
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
    public ModelAndView registerPage(@ModelAttribute("register")UserBean bean, ModelMap model)
    {
        boolean result=userService.registerPage(bean);
        if(result== true)
        {
            model.addAttribute("first",bean.getFirstName());
            model.addAttribute("last",bean.getLastName());
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
        return new ModelAndView("home","command",new UserBean());
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
    public ModelAndView testList()
    {
        List<Test> testlist=testService.testList();
        List<String> list=new ArrayList<>();
        Iterator<Test> itr=testlist.iterator();
        while(itr.hasNext())
        {
            Test test=itr.next();
            list.add(test.getTestDate()+"," +test.getAssessment()+","+test.getTestMarks()+","+test.getEmailId()
            +","+test.getTotalMarks()+","+test.getResult());
        }
        ModelAndView view=new ModelAndView("testlist");
        view.addObject("list",list);
        return view;
    }
    @RequestMapping(value="/spring")
    public ModelAndView spring(@ModelAttribute("spring") Question ques,UserBean bean)
    {
        int score=0;

        if(ques.getAnswer1().equals("J2EE App Development Framework "))
            score=score+10;
        if(ques.getAnswer2().equals("Inversion Of Control"))
            score=score+10;
        if(ques.getAnswer3().equals("Aspect Oriented Programming"))
            score=score+10;
        if(ques.getAnswer4().equals("Application Context "))
            score=score+10;
        if(ques.getAnswer5().equals("Dispatcher Servlet "))
            score=score+10;

        Date date=new Date();
        if(score>=30)
        {

            testService.testStore(new Test(date,"Spring-L1",score,bean.getEmailId(),50,"passed"));
            return new ModelAndView("successPage");
        }
        else
        {
            testService.testStore(new Test(date,"Spring-L1",score,bean.getEmailId(),50,"Failed"));
            return new ModelAndView("failurePage");
        }

    }

    @RequestMapping(value="/hibernate")
    public ModelAndView hibernate(@ModelAttribute("spring") Question ques,UserBean bean)
    {
        int score=0;

        if(ques.getAnswer1().equals("Object Relational Mapping"))
            score=score+10;
        if(ques.getAnswer2().equals("Uni-directional & bi-directional"))
            score=score+10;
        if(ques.getAnswer3().equals("configuration file"))
            score=score+10;
        if(ques.getAnswer4().equals("Hibernate Query Language"))
            score=score+10;
        if(ques.getAnswer5().equals("isolation levels"))
            score=score+10;

        Date date=new Date();
        if(score>=30)
        {

            testService.testStore(new Test(date,"Hibernate-L1",score,bean.getEmailId(),50,"passed"));
            return new ModelAndView("successPage");
        }
        else
        {
            testService.testStore(new Test(date,"Hibernate-L1",score,bean.getEmailId(),50,"Failed"));
            return new ModelAndView("failurePage");
        }
    }

    @RequestMapping("/springAssessment")
    public ModelAndView springAssessment(HttpSession session)
    {
        session.invalidate();
        return new ModelAndView("springAssessment","command",new Question());
    }

    @RequestMapping("/hibernateAssessment")
    public ModelAndView hibernateAssessment(HttpSession session)
    {
        session.invalidate();
        return new ModelAndView("hibernateAssessment","command",new Question());
    }
}
