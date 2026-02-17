package LoopsProgram;
import java.util.Scanner;


public class Vehicle {

	    int vehId;
	    String model;
	    String category;
	    double dailyRate;

	    // Default constructor
	    Vehicle() {
	    }

	    // Parameterized constructor
	    Vehicle(int vehId, String model, String category, double dailyRate) {
	        this.vehId = vehId;
	        this.model = model;
	        this.category = category;
	        this.dailyRate = dailyRate;
	    }

	    // Method to calculate rental cost
	    double calculateRentalCost(int days) {
	        return dailyRate * days;
	    }

	    void display() {
	        System.out.println(vehId + " | " + model + " | " + category + " | " + dailyRate);
	    }
	}

