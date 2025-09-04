package multi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamApi_maxMin {
public static void main(String[] args) {
	
	List<student> list=new ArrayList<student>();
	list.add(new student(1,"saeeeee"));
	list.add(new student(2,"savi"));
	list.add(new student(3,"aakansha"));
	
	System.out.println(list.stream().max(new idcomp()));
	System.out.println(list.stream().min(new idcomp()));
	
   }
}



class student
{
  int id;
   String name;
   
   public student(int id,String name)
   {
	   this.id=id;
	   this.name=name;
   }

@Override
public String toString() {
	return "student [id=" + id + ", name=" + name + "]";
  }
}

class idcomp implements Comparator<student>
{

	@Override
	public int compare(student o1, student o2) {
		// TODO Auto-generated method stub
		return o1.name.length()-o2.name.length();
	 }
	}