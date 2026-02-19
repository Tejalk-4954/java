package OOPs;

public class MainBankAccount {
public static void main(String args[]){

	bankSystem[] bank= {
			new SavingAccount("tejal",8000),
			new currentAccount("piya",5000),
			new SavingAccount("richa",900)
	};
	
	System.out.println("=====bank report====");
	for(int i=0;i<bank.length;i++)
	{
		
		bank[i].displayAccount();
		
		double interest=bank[i].calculateIntrest();
		
		if(bank[i].getBalance()<1000)
		{
			System.out.println("penalty applied:200");
			bank[i].setBalance(bank[i].getBalance()-200);
		}
		
		System.out.println("Interest:"+interest);
		System.out.println("*****************************");
	}
  }

}


