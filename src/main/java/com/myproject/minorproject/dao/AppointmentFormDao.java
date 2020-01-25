package com.myproject.minorproject.dao;

import java.util.List;

import com.myproject.minorproject.model.Appointment;

public interface AppointmentFormDao {

	void addAppointment(Appointment a);
	void deleteAppointment(int id);
	void updateAppointment(Appointment ap);
	
	Appointment getById(int id);
	List<Appointment> getAllAppointment();
	
}
