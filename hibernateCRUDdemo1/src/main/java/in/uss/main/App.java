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
    	
    	user u1=new user();
// 	u1.setName("kittu");
//    	u1.setMob_no(12344);
//    	u1.setAddress("nashik");
//    	
//    	u1.setName("rajan");
//    	u1.setAddress("pune");
//    	u1.setMob_no(123789);
//    	
//    	u1.setAddress("mumbai");
//    	u1.setMob_no(998765);
//    	u1.setName("trisha");
//    	
    	Configuration cfg = new Configuration();
        cfg.configure("/in/uss/config/hibernate.cfg.xml");
        
        SessionFactory sessionfactory = cfg.buildSessionFactory(); 
        //session factory create and manages the session objects - it is heavy weight(don't create more than once) , thread safe object used to configure hibernate and handle connection
        
        Session session = sessionfactory.openSession();            
        // session manages database operation like CRUD and querying , it is lightweight ,short-lived object for interacting with database
        
        Transaction transaction = session.beginTransaction();    
        // Transaction controls the boundaries of a database transaction , it is used to commit or roll back changes to ensure data integrity  
        
         //INSERTION OPERATION
//         try {
//       	  session.save(u1);
//             transaction.commit(); //save permanently
//       	  
//         }
//         catch(Exception e)
//         {
//       	  transaction.rollback();
//       	  e.printStackTrace();
//         }
        
         //SELECT OPERATION
//      try {
//    	  
//  	   user user = session.get(user.class,6);
//  	       if(user!=null)
//  	       {
//  	       System.out.println(user.getId());
//    	   System.out.println(user.getName());
//    	   System.out.println(user.getMob_no());
//    	   System.out.println(user.getAddress());
//    	   System.out.println("successful");
//  	       }
//  	       
//  	       else {
//  	    	   System.out.println("user not found");
//  	       }
//  	    	   
//      }
//      
//      catch(Exception e){
//    	  e.printStackTrace();
//    	  System.out.println("unsuccessful");
//      }
        
        //UPDATE OPERATION
           	
        try {  
        	   user user=session.get(user.class, 1);
        	   user.setMob_no(992229);
        	   session.saveOrUpdate(user);
               transaction.commit();
               System.out.println("user details updated successfully");
        }
        catch(Exception e) {
        	transaction.rollback();
        	e.printStackTrace();
        	System.out.println("unsuccessful to update");
        }
        
        //DELETE OPERATION
        try {
        	user us =new user();
        	us.setId(3);
        	session.delete(us);
        	
        	transaction.commit();
        	System.out.println("Deleted Successfully");
        }
        
        catch(Exception e)
        {
        	e.printStackTrace();
        	System.out.println("unsuccessful to delete");
        }
    }
}
