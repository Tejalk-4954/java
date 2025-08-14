package multi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class StreamAPI_Demo2 {

	public static void main(String[] args) {
		
		List<Employee> list =new ArrayList<Employee>();
		
		list.add(new Employee(1,"abc",2500));
		list.add(new Employee(2,"cde",1500));
		
		
		Consumer<Employee> cons=(i)->{
			
			
			System.out.println(i.id*2);
			System.out.println(i.name+"from consumer");
			System.out.println(i.salary-100.0);
			System.out.println("**********************************");
		
	};
		
//		cons.accept(list);
		list.stream().forEach(cons);
	}
}

class Employee
{
	int id;
	String name;
	int salary;
	
	public Employee(int id,String name,int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
}
