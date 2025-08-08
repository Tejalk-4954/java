package java_program;
import java.util.Scanner;
public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int num1=0;
		int num2=1;
		int num3;
		System.out.print(num1+" "+num2+" ");
		for(int i=3;i<=num;i++)
		{
			num3=num1+num2;
			num1=num2;
			num2=num3;
			System.out.print(num3+" ");
		}
	}

}
