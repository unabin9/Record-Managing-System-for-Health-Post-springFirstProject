package com.myproject.minorproject.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.myproject.minorproject.dao.AdminFormDao;
import com.myproject.minorproject.model.Admin;

@Controller
public class AdminFormController {
	
	@Autowired
	private AdminFormDao adao;

	@RequestMapping(value="/adminSignup",method=RequestMethod.GET)
	public String getAdminForm(Model model){
		
		model.addAttribute("amodel", new Admin());
		return "adminform";
	}
	@RequestMapping(value="/adminSignup",method=RequestMethod.POST)
	public String adminSignup(@ModelAttribute Admin a, Model model, HttpSession session ){
		
		if(StringUtils.isEmpty(session.getAttribute("activeuser"))){
		
			return "home";
		}
		
		adao.adminSignUp(a);
		model.addAttribute("message", "Data Added Successfully");
		model.addAttribute("amodel",new Admin());
		
		return "adminform";
	}
	@RequestMapping(value="/{id}/deleteAdmin", method=RequestMethod.GET)
	public String adminDelete(@PathVariable("id") int id, Model model){
		
		adao.deleteAdmin(id);
		model.addAttribute("alist",adao.getAllAdmin());
		return "adminData";
		
	}
	@RequestMapping(value="/{id}/editAdmin", method=RequestMethod.GET)
	public String adminEdit(@PathVariable("id") int id,Model model){
		
		model.addAttribute("amodel", adao.getById(id));
		
		return "editAdminForm";
		
	}
	@RequestMapping(value ="/updateAdmin", method = RequestMethod.POST)
	public String adminUpdate(@ModelAttribute Admin ad, Model model, HttpSession session) {

		adao.updateAdmin(ad);
		model.addAttribute("alist", adao.getAllAdmin());

		return "adminData";
	}
	@RequestMapping(value ="/adminData", method = RequestMethod.GET)
	public String adminData(Model model) {

		model.addAttribute("alist", adao.getAllAdmin());
		
		return "adminData";
	}

}
