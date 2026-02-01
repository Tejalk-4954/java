package LoopsProgram;

import java.util.Scanner;

public class two {
 public static void main(String[] args) {
      
	         Scanner sc = new Scanner(System.in);
	         int choice, num;

	         // Loop
	         while (true) {
	             System.out.println("\n--- MENU ---");
	             System.out.println("1. Check Even or Odd");
	             System.out.println("2. Print Multiplication Table");
	             System.out.println("3. Exit");
	             System.out.print("Enter your choice: ");
	             choice = sc.nextInt();

	             // Switch case
	             switch (choice) {

	                 case 1:
	                     System.out.print("Enter a number: ");
	                     num = sc.nextInt();

	                     // Nested if
	                     if (num >= 0) {
	                         if (num % 2 == 0) {
	                             System.out.println("The number is Even");
	                         } else {
	                             System.out.println("The number is Odd");
	                         }
	                     } else {
	                         System.out.println("Please enter a positive number");
	                     }
	                     break;

	                 case 2:
	                     System.out.print("Enter a number: ");
	                     num = sc.nextInt();

	                     // Loop
	                     for (int i = 1; i <= 10; i++) {
	                         System.out.println(num + " x " + i + " = " + (num * i));
	                     }
	                     break;

	                 case 3:
	                     System.out.println("Exiting program...");
	                     sc.close();
	                     System.exit(0);

	                 default:
	                     System.out.println("Invalid choice! Try again.");
	             }
	         }
	     }
	 
 }

