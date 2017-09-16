package org.bank.main.controller;

import org.bank.model.UserForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BankController {
	public BankController() {
		System.out.println("Loading Controller");
	}
	
	@RequestMapping("/login")
	public ModelAndView login(){
		System.out.println("In login");
		ModelAndView model = new  ModelAndView("login");
		UserForm user = new UserForm();
		model.addObject("username", "MyBank");
		model.addObject("user", user);
		return model;
	}
	
	@RequestMapping("/index")
	public ModelAndView index(@ModelAttribute("user") UserForm user){
		System.out.println("In Index " + user.getFirstName());
		ModelAndView model = new ModelAndView("login");
		model.addObject("username", user.getFirstName());
		model.addObject("user", user);
		return model;
	}
	
	@RequestMapping("/home")
	public ModelAndView home(@ModelAttribute("user") UserForm user){
		System.out.println("In Home" + user.getFirstName());
		ModelAndView model = new  ModelAndView("home");
		model.addObject("username", user.getFirstName());
		model.addObject("user",user);
		return model;
	}
	
	@RequestMapping("/account")
	public ModelAndView account(){
		System.out.println("In account");
		ModelAndView model = new  ModelAndView("account");
		return model;
	}
	
	
}
