package java_program;
import java.util.Scanner;
public class primary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		
		int flag=1;
		if(num<=1)
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
			System.out.println("number is primary");
		}
		else
		{
			System.out.println("it is not a primary number");
		}

	}

}
