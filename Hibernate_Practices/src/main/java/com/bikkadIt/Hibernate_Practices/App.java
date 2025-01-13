package com.bikkadIt.Hibernate_Practices;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = sessionFactory.openSession();
        
        Student stu = new Student(11, "Kiran", 35, "pune");
        session.save(stu);
         
        
        
        
        
        
        
        session.close();
        sessionFactory.close();
        
    }
}
