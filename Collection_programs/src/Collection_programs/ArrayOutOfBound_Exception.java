package Collection_programs;

public class ArrayOutOfBound_Exception {

	public static void main(String[] args) {
		
		try {
			int a=args.length;
			int c[]= {1,2};
			c[5]=45;
		 }
		catch(ArrayIndexOutOfBoundsException e)
		{
		  System.out.println("Exception occurs"+e);	
		}
		
		finally {
			System.out.println("final");
		}
 }

}
