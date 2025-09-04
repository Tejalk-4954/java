package multi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class limitSkip_highestSalary {
public static void main(String[] args) {

	List<company> comp=new ArrayList<company>();
	
	comp.add(new company(1,"aasha",1234.56));
	comp.add(new company(2,"riya",2789.44));
	comp.add(new company(3,"aaysha",4321.56));
	comp.add(new company(4,"priya",9876.44));
	
	comp.stream().sorted().limit(3).skip(2).//return third highest salary
forEach((i)-> System.out.println(i));
 }
}

class company implements Comparable<company>
{
	int id;
	String name;
	double salary;
	
	public company(int id,String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}

	@Override
	public int compareTo(company o) {
		
		return (int) (o.salary-this.salary) ;
	}

	@Override
	public String toString() {
		return "company [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}

//class salarySort implements Comparator<company>
//{
//
//	@Override
//	public int compare(company o1, company o2) {
//		
//		return  (int)(o2.salary-o1.salary);
//	}
//	
//}