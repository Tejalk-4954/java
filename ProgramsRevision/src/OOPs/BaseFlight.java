package OOPs;

public abstract class BaseFlight {

	protected String flightNumber;
	protected String source;
	protected String destination;
	
	public BaseFlight(String flightNumber,String source,String destination)
	{
		this.flightNumber=flightNumber;
		this.source=source;
		this.destination=destination;
	}
	
	abstract void showFlightDetails();
}

class Flight extends BaseFlight
{

	 private int[][] seats;  // 2D array (0 = empty, 1 = booked)
	    private int rows;
	    private int cols;

	    // Constructor Overloading
	    public Flight(String flightNumber, String source, String destination) {
	        this(flightNumber, source, destination, 5, 6); // default 5x6 seat layout
	    }

	    public Flight(String flightNumber, String source, String destination, int rows, int cols) {
	        super(flightNumber, source, destination);
	        this.rows = rows;
	        this.cols = cols;
	        seats = new int[rows][cols];//initialize 2d array
	    }

	   
	    public boolean bookSeat(int r, int c) {
	        if (r >= rows || c >= cols || seats[r][c] == 1)
	            return false;
	        seats[r][c] = 1;
	        return true;
	    }

	    public boolean cancelSeat(int r, int c) {
	        if (r >= rows || c >= cols || seats[r][c] == 0)
	            return false;
	        seats[r][c] = 0;
	        return true;
	    }

	    
	    @Override
	    void showFlightDetails() {
	        System.out.println("\nFlight: " + flightNumber);
	        System.out.println("From: " + source + " To: " + destination);
	    }

	    public void showSeats() {
	        System.out.println("\nSeat Layout (0 = Empty, 1 = Booked): ");
	        for (int[] row : seats) {
	            for (int seat : row) {
	                System.out.print(seat + " ");
	            }
	            System.out.println();
	        }
	    }
	}
