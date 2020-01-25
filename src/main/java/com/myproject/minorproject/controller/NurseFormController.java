package com.myproject.minorproject.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myproject.minorproject.dao.NurseFormDao;
import com.myproject.minorproject.model.Nurse;

@Controller
public class NurseFormController {
	
	@Autowired
	private NurseFormDao ndao;
	
	@RequestMapping(value="/nurseForm",method=RequestMethod.GET)
	public String getNurseForm(Model model){
		
		model.addAttribute("nmodel", new Nurse());
		return "nurseform";
	}
	
	@RequestMapping(value="/nurseForm",method=RequestMethod.POST)
	public String addNurse(@ModelAttribute Nurse n, Model model){
		
		ndao.addNurse(n);
		model.addAttribute("nmodel", new Nurse());
		model.addAttribute("message","Added Successfully");
		return "nurseform";
	
	}
	@RequestMapping(value="/{id}/deleteNurse",method=RequestMethod.GET)
	public String nurseDelete(@PathVariable("id") int id, Model model){
		
		ndao.deleteNurse(id);
		model.addAttribute("nlist",ndao.getAllNurse());
		
		return "nurseData";
		
	}
	@RequestMapping(value="/{id}/editNurse",method=RequestMethod.GET)
	public String nurseEdit(@PathVariable("id") int id, Model model){
		
		model.addAttribute("nmodel",ndao.getById(id));
		
		return "editNurseForm";
		
	}
	@RequestMapping(value="/updateNurse",method=RequestMethod.POST)
	public String nurseUpdate(@ModelAttribute Nurse nu, Model model, HttpSession session){
		
		ndao.updateNurse(nu);
		model.addAttribute("nlist",ndao.getAllNurse());
		
		return "nurseData";
	}
	@RequestMapping(value ="/nurseData", method = RequestMethod.GET)
	public String nurseData(Model model) {

		model.addAttribute("nlist", ndao.getAllNurse());
		return "nurseData";
	}
}
