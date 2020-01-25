package com.myproject.minorproject.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.myproject.minorproject.model.Appointment;

@Repository
public class AppointmentFormDaoImpl implements AppointmentFormDao{

	@Resource
	private SessionFactory SessionFactory;
	
	@Override
	@Transactional
	public void addAppointment(Appointment a) {
		
		Session ses = SessionFactory.getCurrentSession();
		ses.save(a);	
	}

	@Override
	@Transactional
	public void deleteAppointment(int id) {
		
		Session ses = SessionFactory.getCurrentSession();
		Appointment a = (Appointment) ses.get(Appointment.class, id);
		ses.delete(a);
		
	}

	@Override
	@Transactional
	public void updateAppointment(Appointment ap) {

		Session ses = SessionFactory.getCurrentSession();
		ses.update(ap);
		
	}

	@Override
	@Transactional
	public Appointment getById(int id) {
		
		Session ses = SessionFactory.getCurrentSession();
		Appointment ap = (Appointment) ses.get(Appointment.class,id);
		
		return ap;
	}

	@Override
	@Transactional
	public List<Appointment> getAllAppointment() {
		
		Session ses = SessionFactory.getCurrentSession();
		Criteria crt = ses.createCriteria(Appointment.class);
		
		return crt.list();
		
	}

}
