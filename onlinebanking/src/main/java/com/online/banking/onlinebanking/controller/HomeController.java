package com.online.banking.onlinebanking.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.online.banking.onlinebanking.beans.PanBean;
import com.online.banking.onlinebanking.service.PanDetailService;

@Controller
public class HomeController {
	
	@Autowired
	private PanDetailService panDetailService;

	@RequestMapping(value="/" )
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("onlinebanking","command",new PanBean());
	}
	@RequestMapping(value="/checkEligibility" ,method= RequestMethod.POST)
	public ModelAndView checkEligibility(@ModelAttribute("onlinebanking")PanBean pan,ModelMap model)
	{
		try{
			PanBean panBean=panDetailService.getPan(pan.getPan().toUpperCase());
			model.addAttribute("decision",panBean.getPan());
			model.addAttribute("score",panBean.getCreditScore());
			model.addAttribute("error",0);
			double cs=panBean.getCreditScore();
			if(cs>=5.0)
				model.addAttribute("eligible", 1);
			else
				model.addAttribute("eligible", 0);
		}
		catch(Exception e)
		{
			model.addAttribute("error",1);
		}
		
		return new ModelAndView("result");	
	}
	
	
}
