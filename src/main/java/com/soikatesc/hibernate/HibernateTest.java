package com.soikatesc.hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.soikatesc.dto.Address;
import com.soikatesc.dto.UserDetails;
import com.soikatesc.dto.Vehicle;

public class HibernateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDetails user = new UserDetails();	
		user.setUserName("Md");
		
		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleName("Car");
		
		user.setVehicle(vehicle);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.save(vehicle);
		session.getTransaction().commit();
		session.close();
		
	}

}
