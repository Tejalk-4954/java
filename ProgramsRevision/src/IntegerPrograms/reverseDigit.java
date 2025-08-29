package IntegerPrograms;

import java.util.Scanner;

public class reverseDigit {

	 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		
		int rev=0,digit;
		
		System.out.println("original number::"+num);
		
		while(num!=0)
		{
			digit=num%10;
			rev=rev*10+digit;
			num/=10;
		}
		System.out.println("reversed number::"+rev);
	}
	 
}
