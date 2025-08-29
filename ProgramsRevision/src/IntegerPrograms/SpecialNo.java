package IntegerPrograms;

import java.util.Scanner;

public class SpecialNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number::");
		int number=sc.nextInt();
		
		int n1=number%10;
		int n=number/10;
		int n2=n%10;
		int n3=n/10;
		int finalNo=n1+n3;
		
		if(finalNo==n2)
		{
			System.out.println(number+" is a special number");
		}
		else
		{
			System.out.println(number+" is not special number");

		}
		
	}
}
