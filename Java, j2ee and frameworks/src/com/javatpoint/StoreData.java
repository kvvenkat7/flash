package com.javatpoint;

	import org.hibernate.Session;  
	import org.hibernate.SessionFactory;  
	import org.hibernate.Transaction;  
	import org.hibernate.cfg.Configuration;  
	  
	public class StoreData {  
	public static void main(String[] args) {  
	      
	    //creating configuration object  
	    Configuration cfg=new Configuration();  
	    cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  
	      
	    //creating seession factory object  
	    SessionFactory factory=cfg.buildSessionFactory();  
	      
	    //creating session object  
	    Session session=factory.openSession();  
	      
	    //creating transaction object  
    Transaction t=session.beginTransaction();  
	          
	    Employee e1=new Employee();  
    e1.setId(107);  
	    e1.setFirstName("will");  
	    e1.setLastName("smith");  
	      
	    session.persist(e1);//persisting the object  
	    
	    
	    Employee e2=new Employee();  
	    e2.setId(104);  
		    e2.setFirstName("messi");  
		    e2.setLastName("ronaldo");  
		      
		    session.persist(e2);//persisting the object  
	    
	      
	    t.commit();//transaction is committed  
	    session.close();  
      
	    System.out.println("successfully saved");  
	      
	}  
	}  
