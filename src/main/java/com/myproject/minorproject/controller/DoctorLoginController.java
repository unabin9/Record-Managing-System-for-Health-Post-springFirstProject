package com.myproject.minorproject.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myproject.minorproject.dao.DoctorFormDao;
import com.myproject.minorproject.model.Doctor;

@Controller
public class DoctorLoginController {
	
	@Autowired
	private DoctorFormDao ddao;
	
	@RequestMapping(value="/doctorLoginform",method=RequestMethod.GET)
	public String getDoctorLoginForm(){
		
		return "doctorlogin";
		
	}
	@RequestMapping(value="/doctorLoginform",method=RequestMethod.POST)
	public String loginDoctor(@ModelAttribute Doctor d,Model model, HttpServletRequest req){
		
		if(ddao.doctorLogin(d.getLoginid(), d.getPassword())){
			
			return "doctoraccess";
		}
		model.addAttribute("error", "user  not exist");
		return "doctorlogin";
		
		
	}

}
