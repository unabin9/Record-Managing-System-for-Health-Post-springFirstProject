package com.myproject.minorproject.dao;

import java.util.List;

import com.myproject.minorproject.model.Receptionist;

public interface ReceptionistFormDao {

	void addReceptionist(Receptionist r);
	boolean receptionistLogin(String id,String psw);
	
	void deleteReceptionist(int id);
	void updateReceptionist(Receptionist re);
	
	Receptionist getById(int id);
	List<Receptionist> getAllReceptionist();
}
