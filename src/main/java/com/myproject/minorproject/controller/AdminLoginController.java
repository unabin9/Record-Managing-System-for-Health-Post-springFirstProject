package com.myproject.minorproject.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myproject.minorproject.dao.AdminFormDao;
import com.myproject.minorproject.model.Admin;

@Controller
public class AdminLoginController {

	@Autowired
	private AdminFormDao adao;

	@RequestMapping(value = "/adminlogin", method = RequestMethod.GET)
	public String getAdminLogin() {

		return "home";
	}

	@RequestMapping(value = "/adminlogin", method = RequestMethod.POST)
	public String loginAdmin(@ModelAttribute Admin a, Model model, HttpSession session, HttpServletRequest req) {

		if (adao.adminLogin(a.getLoginid(), a.getPassword())) {

			session.setAttribute("activeuser", a.getLoginid());
			session.setMaxInactiveInterval(200);

			return "adminaccess";

		} else {
			
			model.addAttribute("error", "user  not exist");
			return "home";

		}
	}
	@RequestMapping(value="/logout", method=RequestMethod.GET)
	public String logout(HttpSession session){
		
		session.invalidate();
		
		return "home";
		
	}
}
