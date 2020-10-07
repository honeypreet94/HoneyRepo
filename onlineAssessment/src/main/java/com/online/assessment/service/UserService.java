package com.online.assessment.service;

import com.online.assessment.bean.Test;
import com.online.assessment.bean.UserBean;
import com.online.assessment.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    boolean flag=false;
    //userRepository.userType="candidate";
    String userType;
    public void store()
    {
        userRepository.saveAndFlush(new UserBean("Steve","Martin","steve@gmail.com","wipro@123","admin"));
        userRepository.saveAndFlush(new UserBean("Roger","Kutcher","roger@gmail.com","wipro@123","admin"));
        userRepository.saveAndFlush(new UserBean("Honey","Preet","honey@gmail.com","honey","candidate"));
        flag=true;
    }

    public boolean login(String emailid,String password)
    {
        if(flag==false)
            store();
        //System.out.println(userRepository.findById(emailid));
        //UserBean userBean=userRepository.findByEmailId(emailid).isPresent() ? userRepository.findByEmailId(emailid).get():null;
        UserBean userBean=userRepository.findById(emailid).isPresent() ? userRepository.findById(emailid).get():null;
        if(null==userBean)
            return false;
        else
        {
            userType=userBean.getUserType();
            if(userBean.getPassword().equals(password))
                return true;
        }

        return false;
    }

    public List<UserBean> userList()
    {
        return (List)userRepository.findAll();
    }

    public boolean registerPage(UserBean bean)
    {
        UserBean bean1=userRepository.saveAndFlush(bean);
        if(null==bean1)
            return false;
        else
            return true;
    }

    public String getType()
    {
        return userType;
    }



}
