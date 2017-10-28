package org.bank.controller;

import org.bank.model.Customer;
import org.bank.service.BankServices;
import org.bank.service.IBankServices;
import org.bank.util.HibernateUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BankController {
	
	private IBankServices bankService;
	
	
	public BankController() {
		bankService = new BankServices();
		HibernateUtil util = new HibernateUtil();
		util.getSessionFactory().isOpen();
	}
	
	@RequestMapping("/")
	public ModelAndView login(){
		System.out.println("In login");
		ModelAndView model = new  ModelAndView("login");
		return model;
	}
	
	@RequestMapping("/home")
	public ModelAndView home(@ModelAttribute("user") Customer customer){
		System.out.println("In Home" + customer.getFirstName());
		ModelAndView model = new  ModelAndView("home");
		model.addObject("username", customer.getFirstName());
		model.addObject("user",customer);
		return model;
	}
	
	
	@RequestMapping("/newuser")
	public ModelAndView newuser() {
		System.out.println("in new user");
		ModelAndView model=new ModelAndView("newuser");
		return model;
	}

	
}
