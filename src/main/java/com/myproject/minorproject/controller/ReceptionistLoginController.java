package com.myproject.minorproject.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myproject.minorproject.dao.ReceptionistFormDao;
import com.myproject.minorproject.model.Receptionist;

@Controller
public class ReceptionistLoginController {
	
	@Autowired
	private ReceptionistFormDao rdao;
	
	@RequestMapping(value="/receptionistLoginform",method=RequestMethod.GET)
	public String getReceptionistLoginForm(){
		
		return "receptionistlogin";
		
	}
	@RequestMapping(value="/receptionistLoginform",method=RequestMethod.POST)
	public String loginReceptionist(@ModelAttribute Receptionist r,Model model, HttpServletRequest req){
		
		if(rdao.receptionistLogin(r.getLoginid(), r.getPassword())){
			
			return "receptionistaccess";
		}
		model.addAttribute("error", "user  not exist");
		return "receptionistlogin";
		
		
	}

}
