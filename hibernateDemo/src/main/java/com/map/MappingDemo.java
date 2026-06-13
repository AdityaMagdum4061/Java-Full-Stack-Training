package com.map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingDemo {

	public static void main(String[] args) throws IOException{
		Configuration cfg=new Configuration();
	    cfg.configure("hibernate.cfg.xml");
	    SessionFactory factory= cfg.buildSessionFactory();
	   
	   Question q1=new Question();
	    q1.setQuestionId(4673);
	    q1.setQuestion("What is FSD?");
	   
	    Answer answer=new Answer();
	    answer.setAnswerId(3373);
	    answer.setAnswer("Full Stack Developer");
	   
	    answer.setQuestion(q1);
	    q1.setAnswer(answer);
	    
	    Question q2=new Question();
	    q2.setQuestionId(3032);
	    q2.setQuestion("What is JS?");
	   
	    Answer answer2=new Answer();
	    answer2.setAnswerId(6032);
	    answer2.setAnswer("Java Script");
	    answer2.setQuestion(q2);
	    q2.setAnswer(answer2);
	    
	    Session s= factory.openSession();
	    Transaction tx=s.beginTransaction();
	    s.save(q1);
	    s.save(q2);
	    s.save(answer);
	    s.save(answer2);
	    tx.commit();
	    //Fetching Data from Database
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    //System.out.println("Input id ");
	    int id=Integer.parseInt(br.readLine());
	    Question nq=(Question)s.get(Question.class, id);
	    System.out.println(nq.getQuestion());
	    System.out.println(nq.getAnswer().getAnswer());
	    System.out.println(nq.getAnswer().getAnswerId());
	    factory.close();
	}

	
}
