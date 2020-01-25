package com.myproject.minorproject.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.myproject.minorproject.model.Nurse;

@Repository
public class NurseFormDaoImpl implements NurseFormDao{

	@Resource
	private SessionFactory SessionFactory;
	
	@Override
	@Transactional
	public void addNurse(Nurse n) {
		
		Session ses = SessionFactory.getCurrentSession();
		ses.save(n);	
	}

	@Override
	@Transactional
	public void deleteNurse(int id) {
		
		Session ses = SessionFactory.getCurrentSession();
		Nurse n = (Nurse) ses.get(Nurse.class, id);
		ses.delete(n);
		
	}

	@Override
	@Transactional
	public void updateNurse(Nurse nu) {

		Session ses = SessionFactory.getCurrentSession();
		ses.update(nu);
		
	}

	@Override
	@Transactional
	public Nurse getById(int id) {
		
		Session ses = SessionFactory.getCurrentSession();
		Nurse nu = (Nurse) ses.get(Nurse.class,id);
		
		return nu;
	}

	@Override
	@Transactional
	public List<Nurse> getAllNurse() {
		
		Session ses = SessionFactory.getCurrentSession();
		Criteria crt = ses.createCriteria(Nurse.class);
		
		return crt.list();
		
	}

}
