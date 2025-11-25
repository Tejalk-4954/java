package IntegerPrograms;

import java.util.Scanner;

public class ArmstrongNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number::");
		int number=sc.nextInt();
		
		int original_number=number;
		int result=0;
		int remainder;
		
		while(original_number!=0)
		{
			remainder=original_number%10;
			result+=Math.pow(remainder,3);
			original_number/=10;
		}
		
		if(result==number)
		{
			System.out.println(number+" "+"is a armstrong  number");
		}
		
		else
		{
			System.out.println(number+"is not a armstrong  number");

		}
	}
	

}
