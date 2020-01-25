package com.myproject.minorproject.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.myproject.minorproject.model.Receptionist;

@Repository
public class ReceptionistFormDaoImpl implements ReceptionistFormDao{

	@Resource
	private SessionFactory SessionFactory;
	
	@Override
	@Transactional
	public void addReceptionist(Receptionist r) {
		
		Session ses = SessionFactory.getCurrentSession();
		ses.save(r);	
	}

	@Override
	@Transactional
	public boolean receptionistLogin(String id, String psw) {
		
		Session ses = SessionFactory.getCurrentSession();
		Criteria crt = ses.createCriteria(Receptionist.class);
		crt.add(Restrictions.eq("loginid", id)).add(Restrictions.eq("password", psw));
		Receptionist r = (Receptionist) crt.uniqueResult();
		
		if (r!= null)
			return true;

			return false;
		
	}

	@Override
	@Transactional
	public void deleteReceptionist(int id) {
		
		Session ses = SessionFactory.getCurrentSession();
		Receptionist r = (Receptionist) ses.get(Receptionist.class, id);
		ses.delete(r);
		
	}

	@Override
	@Transactional
	public void updateReceptionist(Receptionist re) {

		Session ses = SessionFactory.getCurrentSession();
		ses.update(re);
		
	}

	@Override
	@Transactional
	public Receptionist getById(int id) {
		
		Session ses = SessionFactory.getCurrentSession();
		Receptionist rec = (Receptionist) ses.get(Receptionist.class,id);
		
		return rec;
	}

	@Override
	@Transactional
	public List<Receptionist> getAllReceptionist() {
		
		Session ses = SessionFactory.getCurrentSession();
		Criteria crt = ses.createCriteria(Receptionist.class);
		
		return crt.list();
		
	}

}
