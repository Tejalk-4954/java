package IntegerPrograms;

import java.util.Scanner;

public class ArmstrongNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number::");
		int number=sc.nextInt();
		
		int originalNo=number;
		int rem,res=0;
		
		while(originalNo!=0)
		{
			rem=originalNo % 10;
			res+=Math.pow(rem, 3);
			originalNo/=10;
		}
		
		if(res==number)
		{
			System.out.println(number+" is Armstrong number");
		}
		else
		{
			System.out.println(number+" is not Armstrong number");

		}
	}

}
