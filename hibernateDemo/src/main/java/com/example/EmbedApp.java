package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbedApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
	    cfg.configure("hibernate.cfg.xml");
	   SessionFactory factory= cfg.buildSessionFactory();
    System.out.println( "Emeddable Code" );
    
    Student s1=new Student();
    s1.setRn(106);
    s1.setName("Chaitanya");
    s1.setCity("Girnar");
    System.out.println(s1);
    
    Certificate c1= new Certificate();
    c1.setCourse("BhagwatGeeta");
    c1.setDuration(3);
    c1.setUni("GorakhDham");
    s1.setCerti(c1);
    
    Session session= factory.openSession();
    Transaction tx=session.beginTransaction();
    session.save(s1);
   
    tx.commit();
    session.close();
    factory.close();
    System.out.println("Done....");
	}

}
