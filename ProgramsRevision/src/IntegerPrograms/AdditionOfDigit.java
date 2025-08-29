package IntegerPrograms;

import java.util.Scanner;

public class AdditionOfDigit {

	 public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
			System.out.println("Enter number::");
			int number=sc.nextInt();
			
		int sum=0;
		
		while(number>0)
		{
			int lastDigit=number%10;
			sum+=lastDigit;
			number/=10;
		}
		
		System.out.println("the sum of digit is::"+sum);
	}
}
