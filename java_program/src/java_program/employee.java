package java_program;

public class employee {
	int empid;
	String ename;
	static  String company="uss";
	
	employee(int empid,String ename)
	{
		this.empid=empid;
		this.ename=ename;
		
	}
	
	void display()
	{
		
		System.out.println(empid+" "+ename+" "+company);
	}
	
	public static void main(String[] args) {
		employee emp = new employee(101,"tom");
		emp.display();
		employee emp1 = new employee(102,"jerry");
		emp1.display();
		
	}

}
