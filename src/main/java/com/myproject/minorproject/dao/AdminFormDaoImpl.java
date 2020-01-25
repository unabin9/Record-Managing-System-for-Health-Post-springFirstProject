package com.myproject.minorproject.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.myproject.minorproject.model.Admin;

@Repository
public class AdminFormDaoImpl implements AdminFormDao {
	
	@Resource
	private SessionFactory SessionFactory;

	@Override
	@Transactional
	public void adminSignUp(Admin a) {
		
		Session ses = SessionFactory.getCurrentSession();
		ses.save(a);
		
	}

	@Override
	@Transactional
	public boolean adminLogin(String id, String psw) {
		
		Session ses = SessionFactory.getCurrentSession();
		Criteria crt = ses.createCriteria(Admin.class);
		crt.add(Restrictions.eq("loginid", id)).add(Restrictions.eq("password", psw));
		Admin a = (Admin) crt.uniqueResult();
		
		if (a != null)
			return true;

			return false;
	}
	@Override
	@Transactional
	public void deleteAdmin(int id) {
		
		Session ses = SessionFactory.getCurrentSession();
		Admin a = (Admin) ses.get(Admin.class, id);
		ses.delete(a);
	}

	@Override
	@Transactional
	public void updateAdmin(Admin ad) {
		
		Session ses = SessionFactory.getCurrentSession();
		ses.update(ad);
		
	}

	@Override
	@Transactional
	public Admin getById(int id) {
		
		Session ses = SessionFactory.getCurrentSession();
		Admin adm = (Admin) ses.get(Admin.class, id);
		
		return adm;
	}

	@Override
	@Transactional
	public List<Admin> getAllAdmin() {

		Session ses = SessionFactory.getCurrentSession();
		Criteria crt = ses.createCriteria(Admin.class);
		
		return crt.list();
	}

}
