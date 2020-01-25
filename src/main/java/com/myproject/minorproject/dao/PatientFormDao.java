package com.myproject.minorproject.dao;

import java.util.List;

import com.myproject.minorproject.model.Patient;

public interface PatientFormDao {

	void addPatient(Patient p);
	void deletePatient(int id);
	void updatePatient(Patient pa);
	
	Patient getById(int id);
	List<Patient> getAllPatient();
	
}
