package IntegerPrograms;

import java.util.Scanner;

public class SumOfNum {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number::");
		int number=sc.nextInt();
		
		int sum=0;
		for(int i=0;i<=number;i++)
		{
			sum+=i;
		}
		System.out.println("sum of number "+number+"is a==>"+sum);
	}

}
