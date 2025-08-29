package IntegerPrograms;

import java.util.Scanner;

public class primaryNO {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number::");
		int num=sc.nextInt();

		int flag=1;

		if(num<=0)
		{
			flag=0;
		}
		else
		{
			for(int i=2;i<=num/2;i++)
			{
				if(num%i==0)
				{
					flag=0;
					break;
				}

			}
		}

		if(flag==1)
		{
			System.out.println(num+"is a primary number");
		}

		else
		{
			System.out.println(num+"is not a primary number");

		}
	}	
}
