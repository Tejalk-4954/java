package LoopsProgram;

public class first {
 public static void main(String[] args) {
	  
//	 //if-else
//	 
//	 int age=18;
//	 if(age>=18)
//	 {
//		 System.out.println("valid");
//	 }
//	 else
//	 {
//		 System.out.println("minor age");
//	 }
//	 
	 //nested if
	 
	 String college="MIT";
	 int marks=80;
	 String branch="IT";
	 
	 if(college=="MIT")
	 { 
		 if(branch=="IT")
		 {
			 if(marks>=80)
			 {
				 System.out.print("Eligible");
			 }
			 else
			 {
				 System.out.println("marks are less than 80");
			 }
		 }
		 else
		 {
			System.out.println("branch is diff"); 
		 }
	 }
	 else
	 {
		 System.out.println("student is not from MIT");
	 }
  }
}
