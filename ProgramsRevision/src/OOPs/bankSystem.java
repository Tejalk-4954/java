package OOPs;

public abstract class bankSystem {

	private String accHolder;
	private double balance;
	
	
	 bankSystem(String accHolder,double balance)
	 {
		 this.accHolder=accHolder;
		 this.balance=balance;
	 }
	 
	 public String getAccHolder()
	 {
		 return accHolder;
	 }
	 
	 public double getBalance()
	 {
		 return balance;
	 }
	 
	 public void setBalance(double balance) {
	        this.balance = balance;
	    }
	 
	 abstract double calculateIntrest();
	 
	 public void displayAccount()
	 {
		 System.out.println("Account holder:"+accHolder);
		 System.out.println("Balance:"+balance);
	 }
}

class SavingAccount extends bankSystem
{

	SavingAccount(String accHolder, double balance) {
		super(accHolder, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	double calculateIntrest() {
		
		return getBalance()*0.05;
	}
}


class currentAccount extends bankSystem
{

	currentAccount(String accHolder, double balance) {
		super(accHolder, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	double calculateIntrest() {
		// TODO Auto-generated method stub
		return getBalance()*0.03;
	}
 	
}