package OOPs;

public class BankAccount {
   private int accNo;
   private double balance;
   
   public BankAccount(int accNo,double balance)
   {
	   this.accNo=accNo;
	   this.balance=balance;
   }
   
   public void deposit(double amount)
   {
	   balance+=amount;
   }
   
   public void withdraw(double amount)
   {
	   if(amount<=balance)
	   {
		   balance-=amount;
	   }
   }
   
   public double getBalance()
   {
	   return balance;
   }
   
   public static void main(String[] args) {
	
	   BankAccount acc=new BankAccount(101,500);
	   acc.deposit(1500);
	   acc.withdraw(400);
	   System.out.println("Balance:"+acc.getBalance());
  }
}
