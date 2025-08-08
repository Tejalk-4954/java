package inheritance;
import java.util.Scanner;
public class SavingsAccount extends BankAccount {
	
	Scanner sc=new Scanner(System.in);

    int balance=sc.nextInt();

	public void withdraw()
	{
		if(balance<100)
		{
			System.out.println("lower account balance ");
		}
		else
		{
			System.out.println("withdraw your money");	
		}
	}
	
	public static void main(String[] args) {
		
		 SavingsAccount SA=new  SavingsAccount();
		 SA.withdraw();
		 SA.deposit();

	}

}
