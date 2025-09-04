package multi;

import java.util.ArrayList;
import java.util.List;

public class StreamApi_limit {

	public static void main(String[] args) {
		List<student_1> st=new ArrayList<student_1>();
		
		st.add(new student_1(1,"abc"));
		st.add(new student_1(2,"ghhjhj"));
		st.add(new student_1(3,"qweertt"));
		st.add(new student_1(5,"adsfdhgfhfjgjj"));
		st.add(new student_1(4,"abcdefg"));
		
		 st.stream().sorted()
	     .limit(2)
	     .skip(1)
	     .map((student)->new StringBuffer(student.name).toString().toUpperCase())
	     .forEach((i)->System.out.println(i));	}
}

class student_1 implements Comparable<student_1>
{
	int id;
	String name;
	
	public student_1(int id,String name)
	{
		this.id=id;
		this.name=name;
	}

	@Override
	public int compareTo(student_1 o) {
		
		return o.id-this.id ;
	}
	
//	public int getid()
//	{
//		return this.id;
//	}

	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + "]";
	}

	

}