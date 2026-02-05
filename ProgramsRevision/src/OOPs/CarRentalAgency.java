package OOPs;

import java.util.Scanner;

public class CarRentalAgency {
	

	    // Method with object array (as per image)
	    static void findCheapest(vehicle[] cars, int days) {
	        vehicle cheapest = cars[0];
	        double minCost = cars[0].calculateRentalCost(days);

	        for (int i = 1; i < cars.length; i++) {
	            double cost = cars[i].calculateRentalCost(days);
	            if (cost < minCost) {
	                minCost = cost;
	                cheapest = cars[i];
	            }
	        }

	        System.out.println("Cheapest Vehicle:");
	        System.out.println("Model: " + cheapest.getModel());
	        System.out.println("Total Cost: " + minCost);
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // 1D array of 5 Vehicle objects
	        vehicle[] cars = new vehicle[5];

	        // Input using loop
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

	            cars[i] = new Car(id, model, category, rate);
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

	                // Option 1: for-each loop
	                case 1:
	                    for (vehicle v : cars) {
	                        System.out.println(
	                                "ID: " + v.getVehId() +
	                                ", Model: " + v.getModel() +
	                                ", Category: " + v.getCategory() +
	                                ", Daily Rate: " + v.getDailyRate()
	                        );
	                    }
	                    break;

	                // Option 2: nested if
	                case 2:
	                    for (vehicle v : cars) {
	                        if (v.getDailyRate() < 1500) {
	                            if (v.getCategory().equalsIgnoreCase("SUV")) {
	                                System.out.println(v.getModel() + " - RECOMMENDED");
	                            }
	                        }
	                    }
	                    break;

	                // Option 3
	                case 3:
	                    System.out.print("Enter rental days: ");
	                    int days = sc.nextInt();
	                    findCheapest(cars, days);
	                    break;

	                case 4:
	                    System.out.println("Exit");
	                    break;

	                default:
	                    System.out.println("Invalid choice");
	            }

	        } 
	        while (choice != 4);
	    }
	}



