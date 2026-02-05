package OOPs;

public abstract class vehicle {

	    private int vehId;
	    private String model;
	    private String category;
	    private double dailyRate;

	    // Default constructor
	    vehicle() {
	        vehId = 0;
	        model = "";
	        category = "";
	        dailyRate = 0;
	    }

	    // Parameterized constructor
	    vehicle(int vehId, String model, String category, double dailyRate) {
	        this.vehId = vehId;
	        this.model = model;
	        this.category = category;
	        this.dailyRate = dailyRate;
	    }

	    // Encapsulation: getters
	    public int getVehId() {
	        return vehId;
	    }

	    public String getModel() {
	        return model;
	    }

	    public String getCategory() {
	        return category;
	    }

	    public double getDailyRate() {
	        return dailyRate;
	    }

	    // Abstract method
	    abstract double calculateRentalCost(int days);
	}



	// INHERITANCE + POLYMORPHISM
	class Car extends vehicle {

	    Car(int vehId, String model, String category, double dailyRate) {
	        super(vehId, model, category, dailyRate);
	    }

	    // Method overriding
	    @Override
	    double calculateRentalCost(int days) {
	        return getDailyRate() * days;
	    }
	}

