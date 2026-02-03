package LoopsProgram;

import java.util.Scanner;

public class CarRentalSystem {


	    // Function to find cheapest vehicle
	 public   static void findCheapest(Vehicle[] cars, int days) {
	        double minCost = Double.MAX_VALUE;
	        Vehicle cheapest = null;

	        for (Vehicle v : cars) {
	            double cost = v.calculateRentalCost(days);
	            if (cost < minCost) {
	                minCost = cost;
	                cheapest = v;
	            }
	        }

	        System.out.println("\nCheapest Deal:");
	        cheapest.display();
	        System.out.println("Total Cost for " + days + " days: " + minCost);
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        Vehicle[] cars = new Vehicle[5];

	        // Input vehicle details
	        for (int i = 0; i < cars.length; i++) {
	            System.out.println("\nEnter details for Vehicle " + (i + 1));
	            System.out.print("Vehicle ID: ");
	            int id = sc.nextInt();

	            sc.nextLine();
	            System.out.print("Model: ");
	            String model = sc.nextLine();

	            System.out.print("Category: ");
	            String category = sc.nextLine();

	            System.out.print("Daily Rate: ");
	            double rate = sc.nextDouble();

	            cars[i] = new Vehicle(id, model, category, rate);
	        }

	        int choice;
	        do {
	            System.out.println("\n--- MENU ---");
	            System.out.println("1. Show all vehicles");
	            System.out.println("2. Find best deal");
	            System.out.println("3. Rental calculator");
	            System.out.println("4. Exit");
	            System.out.print("Enter choice: ");
	            choice = sc.nextInt();

	            switch (choice) {

	                case 1:
	                    // For-each loop
	                    System.out.println("\nAll Vehicles:");
	                    for (Vehicle v : cars) {
	                        v.display();
	                    }
	                    break;

	                case 2:
	                    // Nested if
	                    System.out.println("\nRecommended Vehicles:");
	                    for (Vehicle v : cars) {
	                        if (v.dailyRate < 1500) {
	                            if (v.category.equalsIgnoreCase("SUV")) {
	                                v.display();
	                                System.out.println("RECOMMENDED");
	                            }
	                        }
	                    }
	                    break;

	                case 3:
	                    System.out.print("Enter rental days: ");
	                    int days = sc.nextInt();
	                    findCheapest(cars, days);
	                    break;

	                case 4:
	                    System.out.println("Thank you! Exiting...");
	                    break;

	                default:
	                    System.out.println("Invalid choice!");
	            }

	        } while (choice != 4);

	        sc.close();
	    }
	}


