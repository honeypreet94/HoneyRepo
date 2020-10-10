package com.campaign.management.service;

import com.campaign.management.bean.AdminBean;
import com.campaign.management.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    AdminRepository adminRepository;
    boolean flag=false;

    public void store()
    {
        //adminRepository.saveAndFlush(new AdminBean("steve@gmail.com","wipro@123"));
        //adminRepository.saveAndFlush(new AdminBean("roger@gmail.com","wipro@123"));
        adminRepository.saveAndFlush(new AdminBean("honey@gmail.com","honey"));
        adminRepository.saveAndFlush(new AdminBean("m@m.com","12"));
        flag=true;
    }

    public String login(String email_id,String password)
    {
        if(flag==false)
            store();
        AdminBean adminBean=adminRepository.findById(email_id).isPresent() ? adminRepository.findById(email_id).get():null;
        if(null==adminBean)
            return "false";
        else
        {
            if(adminBean.getPassword().equals(password))
                return "true";

        }
        return "false";
    }

}
