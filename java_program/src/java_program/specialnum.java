package java_program;
import java.util.Scanner;
public class specialnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int first_num=num%10;
		int num2=num/10;
		int second_num=num2%10;
		int third_num=num2/10;
		int result=first_num+third_num;
        if(result==second_num)
        {
        	System.out.println("Special number");
        }
        else
        {
        	System.out.println("not Special number");
        }

	}

}
