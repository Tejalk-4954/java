package LoopsProgram;

import java.util.Scanner;

public class ShopManagementMenu {
 public static void main(String[] args) {
   
	 Scanner sc=new Scanner(System.in);
	 
	 int choice;
	 double grandTotal=0;
	 
	 System.out.println("enter customer name:");
	 String CustomerName=sc.nextLine();
	 
	 do {
		    System.out.println("___MENU___");
	        System.out.println("1. Laptop      - 50000");
            System.out.println("2. Mobile      - 20000");
            System.out.println("3. Headphones  - 3000");
            System.out.println("4. Smart Watch - 7000");
            System.out.println("5. Keyboard    - 1500");
            System.out.println("6. Generate Bill & Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt(); 
            
            if (choice>=1 && choice<=5)
            {
            	int quantity;
            	double price=0;
            	System.out.println("enter quantity");
            	quantity=sc.nextInt();
            	
            	 switch (choice) {

                 case 1:
                     price = 50000;
                     break;

                 case 2:
                     price = 20000;
                     break;

                 case 3:
                     price = 3000;
                     break;

                 case 4:
                     price = 7000;
                     break;

                 case 5:
                     price = 1500;
                     break;
             }
            	 double total=price*quantity;
            	 grandTotal+=total;
            	 System.out.println("item added successfully");
            	 System.out.println("total="+grandTotal);
            }
	 }while(choice!=6);
	 
	 
	 //discounts
	 
	 double disc=0;
	 
	 if(grandTotal>=100000)
	 {
		 disc=20;
	 }
	 else if(grandTotal>=50000)
	 {
		 disc=15;
	 }
	 else if(grandTotal>=20000)
	 {
		 disc=10;
	 }
	 else if(grandTotal>=10000)
	 {
		 disc=5;
	 }
	 
	 double discountAmount=(grandTotal*disc)/100;
	 double finalBill= grandTotal-discountAmount;
	 
	 System.out.println("___FINAL BILL___");
	 System.out.println("customer name:"+CustomerName);
	 System.out.println("Total Amount:"+grandTotal);
	 System.out.println("Discount %:"+disc+"%");
	 System.out.println("Discount amt:"+discountAmount);
	 System.out.println("Final Bill:"+finalBill);
	 sc.close();
 }
}
