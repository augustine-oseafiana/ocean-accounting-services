package com.ocean.accounting.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ocean.accounting.bean.UserBean;
import com.ocean.accounting.service.OceanAccountingService;
import com.ocean.accounting.util.oceanutil;

import jakarta.servlet.http.HttpServletRequest;

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
	 @GetMapping("/contact us")
	 public String contactUs() {
		  logger.debug("contactus");
		  return "contactus";
		  
	 }
	 
	 @GetMapping("/list")
     public ModelAndView list() {
		 logger.debug("Listing Page");
		 
		 List<UserBean> users = this.oceanAccountingService.listUsers();
		 
    	return new ModelAndView ("list","users",users);
    }
	 @GetMapping("/create")
     public String showoceancreate() {
    	 logger.debug("Show Create");
		 
	    return "oceancreate";
	 
	 }
	 
	 @PostMapping("/create")
	 public String createUser(HttpServletRequest req) {
		 logger.debug("create User");
		 
		 String first = req.getParameter("first");
		 String last = req.getParameter("last");
		 String username = req.getParameter("username");
		 String password = req.getParameter("password");
		 String maritalstatus = req.getParameter("maritalstatus");
		 String birth = req.getParameter("birth");
		 String gender = req.getParameter("gender");
		 String homeaddress = req.getParameter("homeaddress");
		 String city = req.getParameter("city");
		 String province = req.getParameter("province");
		 String postcode = req.getParameter("postcode");
		 String country = req.getParameter("country");
		 String phone = req.getParameter("phone");
		 String email = req.getParameter("email");
		 
		 UserBean user = this.createUserBean(null,first, last, username, password, maritalstatus, birth, gender, homeaddress, city, province, postcode, country, phone, email);
		 
		 this.oceanAccountingService.createUser(user);
		 
		 return "redirect:/list";
		 
	 }
	 
	 @GetMapping("/update/{id}")
	 public ModelAndView showUpdate(@PathVariable int id) {
		 logger.debug("Show Update");
		 
		 UserBean user = this.oceanAccountingService.findUser(id);
		 
		 return new ModelAndView("oceanupdate","user",user);
	 }
	 
	 @PostMapping("/update")
	 public String updateUser(HttpServletRequest req) {
		 logger.debug("Update User");
		 
		 String id = req.getParameter("id");
		 String first = req.getParameter("first");
		 String last = req.getParameter("last");
		 String username = req.getParameter("username");
		 String maritalstatus = req.getParameter("maritalstatus");
		 String birth = req.getParameter("birth");
		 String gender = req.getParameter("gender");
		 String homeaddress = req.getParameter("homeaddress");
		 String city = req.getParameter("city");
		 String province = req.getParameter("province");
		 String postcode = req.getParameter("postcode");
		 String country = req.getParameter("country");
		 String phone = req.getParameter("phone");
		 String email = req.getParameter("email");
		 
		 UserBean user = this.createUserBean(id, first, last, username, null, maritalstatus, birth, gender, homeaddress, city, province, postcode, country, phone, email);
		 
		 this.oceanAccountingService.updateUser(user);
		 
		 return "redirect:/list";
		 
	 }
	 
	 @GetMapping("/delete/{id}")
	 public String deleteUser(@PathVariable int id) {
		 
		 this.oceanAccountingService.deleteUser(id);
		 
		 return "redirect:/list";
		 
	 }
	 
	 
	 public UserBean createUserBean(String id, String first, String last, String username, 
			 String password, String maritalstatus, String birth, String gender, 
			 String homeaddress, String city, String province, String postcode, 
			 String country, String phone, String email) {
		 
		 UserBean user = new UserBean(oceanutil.parseId(id) ,first,last,username, password ,maritalstatus,oceanutil.parseDate(birth), gender,homeaddress,city,province,postcode,country,phone,email);
		 
		 return user;
	 }
}
