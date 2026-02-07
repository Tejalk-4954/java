package OOPs;

import java.util.Scanner;

public class FlightManagementSystem {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		Flight flight=new Flight("a10101","mumbai","delhi");
		
		int choice;
		
		do {
			System.out.println("....Flight Management System....");
			System.out.println("1.show details");
			System.out.println("2.show seat layout");
			System.out.println("3.book seat");
			System.out.println("4.cancel seat");
			System.out.println("5.Exit");
		    System.out.println("enter choice:");
		    choice=sc.nextInt();
		    
		    switch(choice)
		    {
		    case 1:
		    	  flight.showFlightDetails();
		    	  break;
		    	  
		    case 2:
		    	  flight.showSeats();
		    	  break;
		   
		    case 3:
		    	  System.out.println("Enter row:");
		    	  int r=sc.nextInt();
		    	  
		    	  System.out.println("enter column:");
		    	  int c=sc.nextInt();
		    	  
		    	  if(flight.bookSeat(r, c))
		    	  {
		    		  System.out.println("seat booked successfully!!");
		    	  }
		    	  else
		    	  {
		    		  System.out.println("seat  not available");
		    	  }
		    	  break;
		    case 4:
		    	  System.out.println("enter row:");
		    	  r=sc.nextInt();
		    	  System.out.println("enter column:");
		    	  c=sc.nextInt();
		    	  
		    	  if(flight.cancelSeat(r, c))
		    		  System.out.println("cancelled ..");
		    	  else
		    		  System.out.println("seat was not booked");
		    	 
		    	  break;
		    	  
		    case 5:
		    	  System.out.println("EXITING..");
		    	  break;
		    	  
		   default:
			     System.out.println("invalid choice");
		    }
		}while(choice !=5);
		sc.close();
	}

}
