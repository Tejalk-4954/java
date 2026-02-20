package LoopsProgram;

import java.util.Scanner;

class CabBookingSystem {

    public static double calculateFare(
    		int vehicleType, int rideTime, int zone,
            double distance, int tollCount,
            int waitingMinutes, boolean roundTrip,
            boolean festive, int passengers,
            int loyaltyYears, int paymentMethod, boolean cancelled) 
    {

        double baseFare = 0;
        double perKm = 0;

        // Vehicle type selection
        switch (vehicleType) {
            case 1: baseFare = 50; perKm = 12; break;     // Mini
            case 2: baseFare = 80; perKm = 15; break;     // Sedan
            case 3: baseFare = 120; perKm = 18; break;    // SUV
            case 4: baseFare = 200; perKm = 25; break;    // Luxury
        }

        double fare = baseFare + (distance * perKm);

        // Ride timing surge
        if (rideTime == 1) fare += distance * perKm * 0.5;   // Morning 1.5x
        else if (rideTime == 3) fare += distance * perKm * 0.8; // Evening 1.8x
        else if (rideTime == 4) fare += 100;  // Night safety charge

        // Airport fee
        if (zone == 1) fare += 150;

        // Toll charges
        fare += tollCount * 80;

        // Waiting charges
        if (waitingMinutes > 5)
            fare += (waitingMinutes - 5) * 3;

        // Festive surge
        if (festive) 
            fare *= 2;

        // Round trip discount
        if (roundTrip)
            fare *= 0.85;

        // Loyalty discount
        if (loyaltyYears > 2)
            fare -= baseFare * 0.12;

        // Ride sharing
        if (passengers > 1)
            fare = fare / passengers;

        // Cancellation
        if (cancelled)
            fare += 50;

        // Payment cashback
        if (paymentMethod == 2)
            fare *= 0.95;
        else if (paymentMethod == 3)
            fare *= 0.98;

        return fare;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rides today: ");
        int rides = sc.nextInt();

        double totalEarnings = 0;

        for (int i = 1; i <= rides; i++) {

            System.out.println("\n--- Ride " + i + " ---");

            System.out.print("Vehicle (1-Mini,2-Sedan,3-SUV,4-Luxury): ");
            int vehicle = sc.nextInt();

            System.out.print("Ride Time (1-Morning,2-Day,3-Evening,4-Night): ");
            int time = sc.nextInt();

            System.out.print("Zone (1-Airport,2-Downtown,3-Suburban,4-Highway): ");
            int zone = sc.nextInt();

            System.out.print("Distance (km): ");
            double distance = sc.nextDouble();

            System.out.print("Toll count: ");
            int toll = sc.nextInt();

            System.out.print("Waiting minutes: ");
            int wait = sc.nextInt();

            System.out.print("Round Trip (true/false): ");
            boolean round = sc.nextBoolean();

            System.out.print("Festive (true/false): ");
            boolean festive = sc.nextBoolean();

            System.out.print("Passengers: ");
            int passengers = sc.nextInt();

            System.out.print("Loyalty years: ");
            int loyalty = sc.nextInt();

            System.out.print("Payment (1-Cash,2-Wallet,3-Card): ");
            int payment = sc.nextInt();

            System.out.print("Cancelled (true/false): ");
            boolean cancel = sc.nextBoolean();

            double fare = calculateFare(vehicle, time, zone, distance,
                                        toll, wait, round, festive,
                                        passengers, loyalty, payment, cancel);

            System.out.println("Ride Fare: ₹" + fare);
            totalEarnings += fare;
        }

        System.out.println("\nTotal Driver Earnings Today: ₹" + totalEarnings);
    }
}