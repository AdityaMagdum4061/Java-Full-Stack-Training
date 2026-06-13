package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	 Configuration cfg=new Configuration();
    	    cfg.configure("hibernate.cfg.xml");
    	   SessionFactory factory= cfg.buildSessionFactory();
        System.out.println( "Hello World!" );
        
        Student s1=new Student();
        s1.setRn(205);
        s1.setName("Raje");
        s1.setCity("Raigad");
        
        Certificate c1 = new Certificate();
        c1.setDuration(2);
        c1.setCourse("Java FullStack");
        c1.setUni("Pune University");
        s1.setCerti(c1);
        
        System.out.println(s1);
        
        Session session= factory.openSession();
        Transaction tx=session.beginTransaction();
        session.save(s1);
       
        tx.commit();
        session.close();
        
        System.out.println("Done....");
    }
}