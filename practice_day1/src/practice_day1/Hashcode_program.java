package practice_day1;

public class Hashcode_program {
	
	public static void main(String[] args) {
		String str="hello";
		String str2="hello";
     	System.out.println(str==str2);//== always check the referenced ,it is used for compare the two variables. 
		
		String str3= new String("hello");
		String str4= new String("hello");
		
	System.out.println(str3.equals(str4));//.equals always check the content in primitive data types and in non-primitive data type it checks the referenced

	}

}
