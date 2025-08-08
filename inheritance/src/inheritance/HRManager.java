package inheritance;

public class HRManager extends Employee {
	
	public static void work()
	{
		System.out.println("it is method in HRmanager class ");
	}
	
	public void addEmployee()
	{
		System.out.println("Add new Employee");
	}
	public static void main(String[] args) {
		HRManager hm=new HRManager();
		hm.work();
		hm.addEmployee();
		hm.getSalary();
       
		
	}

}
