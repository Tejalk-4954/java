package java_program;
import java.util.Scanner;
public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		
		int rem,original_no,result=0;
		original_no=num;
		while(original_no!=0)
		{
			rem=original_no%10;
			result+=Math.pow(rem,3);
			original_no/=10;
		}
		if(result==num)
		{
        System.out.println("armastrong");
		}
		else
		{
			System.out.println("no Armstrong");
		}
		
	}

}
