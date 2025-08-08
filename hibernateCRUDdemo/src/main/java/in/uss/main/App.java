package in.uss.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.uss.entities.user;

public class App 
{
    public static void main( String[] args )
    {
//         user user1 = new user();
//         user1.setName("john");
//         user1.setEmail("john@gmail.com");
//         user1.setPassword("j123");
//         user1.setGender("male");
//         user1.setCity("pune");
    	//inserrtion operation//
   	user user1 = new user();
     user1.setName("riya");
     user1.setEmail("riya@gmail.com");
     user1.setPassword("riya");
      user1.setGender("Female");
      user1.setCity("nashik");
    	
    	
         
         Configuration cfg = new Configuration();
         cfg.configure("/in/uss/config/hibernate.cfg.xml");
         
         SessionFactory sessionfactory = cfg.buildSessionFactory(); 
         //session factory create and manages the session objects - it is heavy weight(don't create more than once) , thread safe object used to configure hibernate and handle connection
         
         Session session = sessionfactory.openSession();            
         // session manages database operation like CRUD and querying , it is lightweight ,short-lived object for interacting with database
         
         Transaction transaction = session.beginTransaction();    
         // Transaction controls the boundaries of a database transaction , it is used to commit or roll back changes to ensure data integrity  
         
          
          try {
        	  session.save(user1);
              transaction.commit(); //save permanently
        	  
          }
          catch(Exception e)
          {
        	  transaction.rollback();
        	  e.printStackTrace();
          }
          
    }
}
 