package com.sony.SpringMvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sony.SpringMvc.dao.DetailsDAO;
import com.sony.SpringMvc.dto.Details;
import com.sony.SpringMvc.dto.LoginDTO;
import com.sony.SpringMvc.entity.SpringMvcRegistrationDetails;
import com.sony.SpringMvc.services.CommanService;

@Controller
@RequestMapping("/")
public class AppController {
	
	@Autowired
	public CommanService service;
	
	@RequestMapping(value = "/register" , method = RequestMethod.POST)
	public ModelAndView register(Details details) {	
	ModelAndView modelAndView = new ModelAndView();
	String msg = service.validateAndSave(details);
	System.out.println(msg);
	modelAndView.addObject("responseMSG", msg);
	modelAndView.setViewName("Home.jsp");
    return modelAndView;
	}
	
	@RequestMapping(value ="/login" ,method = RequestMethod.POST )
	public ModelAndView login(LoginDTO dto) {
        ModelAndView modelAndView = new ModelAndView();
        System.out.println(dto);
        String response = service.validateAndLogin(dto);
        System.out.println(response);
    	modelAndView.addObject("responseMSG", response);
    	
    	if(response.equals("Login Successfull")) {
    		modelAndView.setViewName("Home.jsp");
    	}else {
    		modelAndView.setViewName("login.jsp");
    	}
    	
        return modelAndView;
		
	}

}
