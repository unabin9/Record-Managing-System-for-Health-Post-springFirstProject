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

import com.myproject.minorproject.dao.ReceptionistFormDao;
import com.myproject.minorproject.model.Receptionist;

@Controller
public class ReceptionistFormController {
	
	@Autowired
	private ReceptionistFormDao rdao;
	
	@RequestMapping(value="/receptionistForm",method=RequestMethod.GET)
	public String getReceptionistForm(Model model){
		
		model.addAttribute("rmodel", new Receptionist());
		return "receptionistform";
	}
	
	@RequestMapping(value="/receptionistForm",method=RequestMethod.POST)
	public String addAdmin(@ModelAttribute Receptionist r, Model model){
		
		rdao.addReceptionist(r);
		model.addAttribute("rmodel", new Receptionist());
		model.addAttribute("message","Added Successfully");
		return "receptionistform";
	
	}
	@RequestMapping(value="/{id}/deleteReceptionist",method=RequestMethod.GET)
	public String receptionistDelete(@PathVariable("id") int id, Model model){
		
		rdao.deleteReceptionist(id);
		model.addAttribute("rlist",rdao.getAllReceptionist());
		
		return "receptionistData";
		
	}
	@RequestMapping(value="/{id}/editReceptionist",method=RequestMethod.GET)
	public String receptionistEdit(@PathVariable("id") int id, Model model){
		
		model.addAttribute("rmodel",rdao.getById(id));
		
		return "editReceptionistForm";
		
	}
	@RequestMapping(value="/updateReceptionist",method=RequestMethod.POST)
	public String receptionistUpdate(@ModelAttribute Receptionist re, Model model, HttpSession session){
		
		rdao.updateReceptionist(re);
		model.addAttribute("rlist",rdao.getAllReceptionist());
		
		return "receptionistData";
	}
	@RequestMapping(value ="/receptionistData", method = RequestMethod.GET)
	public String receptionistData(Model model) {

		model.addAttribute("rlist", rdao.getAllReceptionist());
		model.addAttribute("r1list", rdao.getAllReceptionist());
		return "receptionistData";
	}
	@RequestMapping(value ="/readOnlyReceptionistData", method = RequestMethod.GET)
	public String readOnlyReceptionistData(Model model) {

		//model.addAttribute("rlist", rdao.getAllReceptionist());
		model.addAttribute("r1list", rdao.getAllReceptionist());
		return "readOnlyReceptionistData";
	}

}
