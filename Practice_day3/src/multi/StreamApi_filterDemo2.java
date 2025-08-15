package multi;

import java.util.ArrayList;
import java.util.List;

public class StreamApi_filterDemo2 {
	public static void main(String[] args) {
		
		List<Employee_1> list=new ArrayList<Employee_1>();
		
		list.add(new Employee_1(1,"vishakha",3456.12));
		list.add(new Employee_1(1,"raj",3356.12));
		list.add(new Employee_1(1,"reva",3456.12));
		list.add(new Employee_1(1,"dipti",3456.12));
		
		list.stream().filter((emp)->(emp.getsalary()>30.0)).
		map((emp)->(new StringBuffer(emp.getname()).reverse()).toString().toUpperCase())
        .sorted()
        .forEach((emp)->System.out.println(emp));

	}

}

class Employee_1 implements Comparable<Employee_1>
{
   int id;
   String name;
   double salary;
   
   public Employee_1(int id,String name,double salary)
   {
	   this.id=id;
	   this.name=name;
	   this.salary=salary;
   }
   
   public int getid()
	{
		return this.id;
	}
	
	public String getname()
	{
		return this.name;
	}
	
	public double getsalary()
	{
		return this.salary;
	}
	
	
	public int compareTo(Employee_1 o) {
		
		return o.getname().length()-this.getname().length();
	}
	
}
