package com.javatpoint;

	import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;  
	import org.hibernate.cfg.Configuration;  
	  
	public class UserDao {  
	  
	public static int register(User u){  
	 int i=0;  
	 Configuration cfg=new Configuration();  
	    cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  
	      
	    //creating seession factory object  
	    SessionFactory factory=cfg.buildSessionFactory();  
	      
	    //creating session object  
	    Session session=factory.openSession();  
	      
	    //creating transaction object  
	          
	  Transaction t=session.beginTransaction();  
	  t.begin();  
	                  
	  i=(Integer)session.save(u);  
	                  
	  t.commit();  
	  session.close();  
	    
	  return i;  
	 }  
	}  
