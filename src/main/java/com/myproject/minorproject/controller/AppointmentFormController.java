package com.myproject.minorproject.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myproject.minorproject.dao.AppointmentFormDao;
import com.myproject.minorproject.model.Appointment;

@Controller
public class AppointmentFormController {
	
	@Autowired
	private AppointmentFormDao adao;
	
	@RequestMapping(value="/appointmentForm",method=RequestMethod.GET)
	public String getAppointmentForm(Model model){
		
		model.addAttribute("amodel", new Appointment());
		return "appointmentform";
	}
	
	@RequestMapping(value="/appointmentForm",method=RequestMethod.POST)
	public String addAppointment(@ModelAttribute Appointment a, Model model){
		
		adao.addAppointment(a);
		model.addAttribute("amodel", new Appointment());
		model.addAttribute("message","Added Successfully");
		return "appointmentform";
	
	}
	@RequestMapping(value="/{id}/deleteAppointment",method=RequestMethod.GET)
	public String appointmentDelete(@PathVariable("id") int id, Model model){
		
		adao.deleteAppointment(id);
		model.addAttribute("alist",adao.getAllAppointment());
		
		return "appointmentData";
		
	}
	@RequestMapping(value="/{id}/editAppointment",method=RequestMethod.GET)
	public String appointmentEdit(@PathVariable("id") int id, Model model){
		
		model.addAttribute("amodel",adao.getById(id));
		
		return "editAppointmentForm";
		
	}
	@RequestMapping(value="/updateAppointment",method=RequestMethod.POST)
	public String appointmentUpdate(@ModelAttribute Appointment ap, Model model, HttpSession session){
		
		adao.updateAppointment(ap);
		model.addAttribute("alist",adao.getAllAppointment());
		
		return "appointmentData";
	}
	@RequestMapping(value ="/appointmentData", method = RequestMethod.GET)
	public String appointmentData(Model model) {

		model.addAttribute("alist", adao.getAllAppointment());
		model.addAttribute("a1list", adao.getAllAppointment());
		return "appointmentData";
	}
	@RequestMapping(value ="/readOnlyAppointmentData", method = RequestMethod.GET)
	public String readOnlyAppointmentData(Model model) {

		model.addAttribute("a1list", adao.getAllAppointment());
		return "readOnlyAppointmentData";
	}

}
