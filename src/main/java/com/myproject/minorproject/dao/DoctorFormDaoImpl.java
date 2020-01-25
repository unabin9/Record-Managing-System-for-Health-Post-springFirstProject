package com.myproject.minorproject.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.myproject.minorproject.model.Doctor;

@Repository
public class DoctorFormDaoImpl implements DoctorFormDao{

	@Resource
	private SessionFactory SessionFactory;
	
	@Override
	@Transactional
	public void addDoctor(Doctor d) {
		
		Session ses = SessionFactory.getCurrentSession();
		ses.save(d);	
	}

	@Override
	@Transactional
	public boolean doctorLogin(String id, String psw) {
		
		Session ses = SessionFactory.getCurrentSession();
		Criteria crt = ses.createCriteria(Doctor.class);
		crt.add(Restrictions.eq("loginid", id)).add(Restrictions.eq("password", psw));
		Doctor d = (Doctor) crt.uniqueResult();
		
		if (d!= null)
			return true;

			return false;
		
	}

	@Override
	@Transactional
	public void deleteDoctor(int id) {
		
		Session ses = SessionFactory.getCurrentSession();
		Doctor d = (Doctor) ses.get(Doctor.class, id);
		ses.delete(d);
		
	}

	@Override
	@Transactional
	public void updateDoctor(Doctor doc) {

		Session ses = SessionFactory.getCurrentSession();
		ses.update(doc);
		
	}

	@Override
	@Transactional
	public Doctor getById(int id) {
		
		Session ses = SessionFactory.getCurrentSession();
		Doctor doc = (Doctor) ses.get(Doctor.class,id);
		
		return doc;
	}

	@Override
	@Transactional
	public List<Doctor> getAllDoctor() {
		
		Session ses = SessionFactory.getCurrentSession();
		Criteria crt = ses.createCriteria(Doctor.class);
		
		return crt.list();
		
	}

}
