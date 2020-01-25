package com.myproject.minorproject.dao;

import java.util.List;

import com.myproject.minorproject.model.Doctor;

public interface DoctorFormDao {

	void addDoctor(Doctor d);
	boolean doctorLogin(String id,String psw);
	
	void deleteDoctor(int id);
	void updateDoctor(Doctor doc);
	
	Doctor getById(int id);
	List<Doctor> getAllDoctor();
	
}
