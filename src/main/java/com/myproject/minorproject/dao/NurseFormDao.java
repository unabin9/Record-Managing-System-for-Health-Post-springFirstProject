package com.myproject.minorproject.dao;

import java.util.List;

import com.myproject.minorproject.model.Nurse;

public interface NurseFormDao {

	void addNurse(Nurse n);
	void deleteNurse(int id);
	void updateNurse(Nurse nu);
	
	Nurse getById(int id);
	List<Nurse> getAllNurse();
	
}
