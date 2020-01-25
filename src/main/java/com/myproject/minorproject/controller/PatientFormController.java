package com.myproject.minorproject.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myproject.minorproject.dao.PatientFormDao;
import com.myproject.minorproject.model.Patient;

@Controller
public class PatientFormController {
	
	@Autowired
	private PatientFormDao pdao;
	
	@RequestMapping(value="/patientForm",method=RequestMethod.GET)
	public String getPatientForm(Model model){
		
		model.addAttribute("pmodel", new Patient());
		return "patientform";
	}
	
	@RequestMapping(value="/patientForm",method=RequestMethod.POST)
	public String addPatient(@ModelAttribute Patient p, Model model){
		
		pdao.addPatient(p);
		model.addAttribute("pmodel", new Patient());
		model.addAttribute("message","Added Successfully");
		return "patientform";
	
	}
	@RequestMapping(value="/{id}/deletePatient",method=RequestMethod.GET)
	public String patientDelete(@PathVariable("id") int id, Model model){
		
		pdao.deletePatient(id);
		model.addAttribute("plist",pdao.getAllPatient());
		
		return "patientData";
		
	}
	@RequestMapping(value="/{id}/editPatient",method=RequestMethod.GET)
	public String patientEdit(@PathVariable("id") int id, Model model){
		
		model.addAttribute("pmodel",pdao.getById(id));
		
		return "editPatientForm";
		
	}
	@RequestMapping(value="/updatePatient",method=RequestMethod.POST)
	public String patientUpdate(@ModelAttribute Patient pa, Model model, HttpSession session){
		
		pdao.updatePatient(pa);
		model.addAttribute("plist",pdao.getAllPatient());
		
		return "patientData";
	}
	@RequestMapping(value ="/patientData", method = RequestMethod.GET)
	public String patientData(Model model) {

		model.addAttribute("plist", pdao.getAllPatient());
		model.addAttribute("p1list", pdao.getAllPatient());
		return "patientData";
	}
	@RequestMapping(value ="/readOnlyPatientData", method = RequestMethod.GET)
	public String readOnlyPatientData(Model model) {

		model.addAttribute("p1list", pdao.getAllPatient());
		return "readOnlyPatientData";
	}

}
