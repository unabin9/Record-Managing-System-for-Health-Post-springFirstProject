package com.myproject.minorproject.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.myproject.minorproject.model.Patient;

@Repository
public class PatientFormDaoImpl implements PatientFormDao{

	@Resource
	private SessionFactory SessionFactory;
	
	@Override
	@Transactional
	public void addPatient(Patient p) {
		
		Session ses = SessionFactory.getCurrentSession();
		ses.save(p);	
	}

	@Override
	@Transactional
	public void deletePatient(int id) {
		
		Session ses = SessionFactory.getCurrentSession();
		Patient p = (Patient) ses.get(Patient.class, id);
		ses.delete(p);
		
	}

	@Override
	@Transactional
	public void updatePatient(Patient pa) {

		Session ses = SessionFactory.getCurrentSession();
		ses.update(pa);
		
	}

	@Override
	@Transactional
	public Patient getById(int id) {
		
		Session ses = SessionFactory.getCurrentSession();
		Patient pa = (Patient) ses.get(Patient.class,id);
		
		return pa;
	}

	@Override
	@Transactional
	public List<Patient> getAllPatient() {
		
		Session ses = SessionFactory.getCurrentSession();
		Criteria crt = ses.createCriteria(Patient.class);
		
		return crt.list();
		
	}

}
