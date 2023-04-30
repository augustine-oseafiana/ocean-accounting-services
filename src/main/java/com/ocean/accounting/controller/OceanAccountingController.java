package com.ocean.accounting.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ocean.accounting.bean.UserBean;
import com.ocean.accounting.service.OceanAccountingService;

@Controller
public class OceanAccountingController {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	OceanAccountingService oceanAccountingService;
	
	@GetMapping("/")
	public String ocean( ) {
		logger.debug("Landing Page");
		return "ocean";
		
	}
     
	 @GetMapping("/about")
     public String about() {
		 logger.debug("about");
    	return "about";
    }
	 
	 @GetMapping("/list")
     public ModelAndView list() {
		 logger.debug("Listing Page");
		 
		 List<UserBean> users = this.oceanAccountingService.listUsers();
		 
    	return new ModelAndView ("list","users",users);
    }
}
