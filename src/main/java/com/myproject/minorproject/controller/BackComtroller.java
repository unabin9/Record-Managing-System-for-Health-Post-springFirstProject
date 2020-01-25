package com.myproject.minorproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BackComtroller {

	@RequestMapping(value="/adminControl",method=RequestMethod.GET)
	public String backControl(){
		
		return "adminaccess";
	}
	@RequestMapping(value="/receptionistControl",method=RequestMethod.GET)
	public String backController1(){
		
		return "receptionistaccess";
		
	}
}
