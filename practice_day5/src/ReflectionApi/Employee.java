package ReflectionApi;

public class Employee {

	int id;
	String name;
	private double salary;
	private String city;
	
	public Employee()
	{
		
	}
	
	private Employee(int i)
	{
		
	}
	
	protected Employee(StringBuffer sb,int i,int j)
	{
		
	}
	
	Employee(double d)
	{
		
	}
	
	public void display()
	{
		System.out.println("displayingg....");
	}
	
	private void securemethod(int i,int k)
	{
		System.out.println("this is secure method");
	}
	
	final void fainaldemo()
	{
		System.out.println("final method");
	}
	
	void defaultdemo()
	{
		System.out.println("default method");
	}
}
