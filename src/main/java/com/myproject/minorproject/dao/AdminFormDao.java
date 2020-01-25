package com.myproject.minorproject.dao;

import java.util.List;

import com.myproject.minorproject.model.Admin;

public interface AdminFormDao {

	void adminSignUp(Admin a);
	boolean adminLogin(String id,String psw);
	
	void deleteAdmin(int id);
	void updateAdmin(Admin ad);
	
	Admin getById(int id);
	List<Admin> getAllAdmin();
}
