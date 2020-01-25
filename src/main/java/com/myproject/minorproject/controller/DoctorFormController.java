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

import com.myproject.minorproject.dao.DoctorFormDao;
import com.myproject.minorproject.model.Doctor;

@Controller
public class DoctorFormController {
	
	@Autowired
	private DoctorFormDao ddao;
	
	@RequestMapping(value="/doctorForm",method=RequestMethod.GET)
	public String getDoctorForm(Model model){
		
		model.addAttribute("dmodel", new Doctor());
		return "doctorform";
	}
	
	@RequestMapping(value="/doctorForm",method=RequestMethod.POST)
	public String addDoctor(@ModelAttribute Doctor d, Model model){
		
		ddao.addDoctor(d);
		model.addAttribute("dmodel", new Doctor());
		model.addAttribute("message","Added Successfully");
		return "doctorform";
	
	}
	@RequestMapping(value="/{id}/deleteDoctor",method=RequestMethod.GET)
	public String doctorDelete(@PathVariable("id") int id, Model model){
		
		ddao.deleteDoctor(id);
		model.addAttribute("dlist",ddao.getAllDoctor());
		
		return "doctorData";
		
	}
	@RequestMapping(value="/{id}/editDoctor",method=RequestMethod.GET)
	public String doctorEdit(@PathVariable("id") int id, Model model){
		
		model.addAttribute("dmodel",ddao.getById(id));
		
		return "editDoctorForm";
		
	}
	@RequestMapping(value="/updateDoctor",method=RequestMethod.POST)
	public String doctorUpdate(@ModelAttribute Doctor doc, Model model, HttpSession session){
		
		ddao.updateDoctor(doc);
		model.addAttribute("dlist",ddao.getAllDoctor());
		
		return "doctorData";
	}
	@RequestMapping(value ="/doctorData", method = RequestMethod.GET)
	public String doctorData(Model model) {

		model.addAttribute("dlist", ddao.getAllDoctor());
		model.addAttribute("d1list", ddao.getAllDoctor());
		return "doctorData";
	}
	@RequestMapping(value ="/readOnlyDoctorData", method = RequestMethod.GET)
	public String readOnlyDoctorData(Model model) {
		
		model.addAttribute("d1list", ddao.getAllDoctor());
		return "readOnlyDoctorData";
	}

}
