package com.soikatesc.hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.soikatesc.dto.Address;
import com.soikatesc.dto.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDetails user = new UserDetails();	
		user.setUserName("Md");
	
		Address addr1 = new Address();
		addr1.setStreet("First Street");
		
		Address addr2 = new Address();
		addr2.setStreet("2nd street");
		
		user.getListofAddresses().add(addr1);
		user.getListofAddresses().add(addr2);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
		
	}

}
