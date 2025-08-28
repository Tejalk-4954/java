package methodreference;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class collectorsDemo2 {

	public static void main(String[] args) {
		Employee_1 e1=new Employee_1(1,"ABC");
		Employee_1 e2=new Employee_1(2,"CDE");
		Employee_1 e3=new Employee_1(3,"PQR");
		
		List<Employee_1> list=new ArrayList<Employee_1>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		list.stream().collect(Collectors.toList()).forEach((i)-> System.out.println(i));;
	}
}


class Employee_1 implements Collector<>{
	int id;
	String name;
  	
	public Employee_1(int id, String name)
	{
		this.id=id;
		this.name=name;
	}

	@Override
	public String toString() {
		return "Employee_1 [id=" + id + ", name=" + name + "]";
	}
	
	
}