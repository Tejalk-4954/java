package practice_day2;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		
//		Map<supervisor,Integer> tcs = new TreeMap<supervisor,Integer>();

		Map<supervisor,Integer> tcs = new TreeMap(new nameComparator());

		supervisor first = new supervisor(1,"abc",34567);
		supervisor second = new supervisor(2,"defgh",3457);

		tcs.put(first, 2);
		tcs.put(second, 1);
		
		System.out.println(tcs);
	}

}

class supervisor implements Comparable<supervisor>
{
	int id;
	String name;
	long salary;
	
	public supervisor(int id,String name,long salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}

	@Override
	public int compareTo(supervisor o) {
		if(this.salary>o.salary)
		{
			return 1;
		}
		
		else if(this.salary<o.salary)
		{
			return -1;
		}
		
		return 0;
	
	}
	
	public String toString()
	{
		return" "+this.salary+" "+this.name+" "+this.id;
		
	}
	
}

class nameComparator implements Comparator<supervisor>
{

	@Override
	public int compare(supervisor o1, supervisor o2) {
		return o2.name.length()-o1.name.length();
		}
	
}

