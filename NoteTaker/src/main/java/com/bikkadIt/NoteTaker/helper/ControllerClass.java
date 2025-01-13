package com.bikkadIt.NoteTaker.helper;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bikkadIt.NoteTaker.entity.Student;

public class ControllerClass {

	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		Student stu  = new Student();
		stu.setsId(11);
		stu.setsFName("Amit");
		stu.setsLName("Jadhav");
		stu.setScity("Pune");
		
		s.save(stu);
		
		t.commit();
		s.close();
		sf.close();
	}

}
