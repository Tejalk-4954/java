package practice_day2;

import java.util.HashSet;
import java.util.Set;

public class HashSet_demo {

	public static void main(String[] args) {
		
		student first =new student(1,"sej");
		
		student second =new student(2,"tej");
		
		Set<student> set =new HashSet<student>();
		set.add(first);
		set.add(second);
		  System.out.println(set);
		
		
		
	}
}

class student{
	int id;
	String name;
	
	public student(int id,String name) {
		
		this.id=id;
		this.name=name;
	}
	
	public int hashcode() {
		return 100+this.id;
		
	}
	
	public boolean equals(Object o)
	{
		if(this ==o) 
		{
			return true;
		}
		
		student st =(student)o;
		
		if(this.id==st.id && this.name.equals(st.name)) 
		{
			return true;
		}
		return false;
	}
}
