package Collection_programs;

public class Exception_handling {

	public static void main(String[] args) {
	 int a=10;
	 int b=5;
	 
	 try {
		  System.out.println(a/b); //Arithmetic Exception 
	 }
	 
	 catch(Exception e){
		 System.out.println("division by zero is not valid");
	 }
     
	 finally {
		 System.out.println("success");
	 }
	}

}
