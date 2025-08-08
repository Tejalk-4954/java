package java_program;
import java.util.Scanner;
public class reverseDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int rem,rev=0;
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
		    num/=10;
		}
		System.out.println("reverse digit::"+rev);

	}

}
