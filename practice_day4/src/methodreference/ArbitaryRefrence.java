package methodreference;

import java.util.ArrayList;
import java.util.List;

public class ArbitaryRefrence {

	public static void main(String[] args) {
		
		Student_st st1=new Student_st();
		Student_st st2=new Student_st();
		
//		st1.name="ab";
//		st2.name="cd";
		
		List<String> list=new ArrayList<String>();
		
		list.add("abc");
		list.add("cdf");
		
   list.stream().map(StringBuffer::new).map(StringBuffer::length).forEach((i)-> System.out.println(i));
	}

}

class Student_st
{
 String name;	
}