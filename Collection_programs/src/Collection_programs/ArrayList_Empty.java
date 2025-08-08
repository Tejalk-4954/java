package Collection_programs;
import java.util.ArrayList;
public class ArrayList_Empty {

	public static void main(String[] args) {
	        // Creating an empty ArrayList
	        ArrayList<String> List = new ArrayList<>();
	        List.add("hello");
	        
	        // Checking if the ArrayList is empty
	        boolean isEmpty = List.isEmpty();
	        
	        // Printing the result
	        if (isEmpty) {
	            System.out.println("The ArrayList is empty.");
	        } else {
	            System.out.println("The ArrayList is not empty.");
	        }

	        
	    }
	}