package methodreference;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class methodreference_one {

	public static void main(String[] args) {
		
		student.id=100;
		
	    Supplier<Integer> ids= student::displayid;//static method reference
	    
	    Supplier<student> stud=student::create;
	    
	    Supplier<List<student>> arr=student::createlist;
		
	    System.out.println(ids.get());
	    System.out.println(stud.get());
	    System.out.println(arr.get());

	}

}

class student
{
   static int id;
   String name;
   
   public student()
   {
	   System.out.println("object created");
   }
   
   public static int displayid()
   {
	   return id;
   }
   
   public static student create()
   {
	   return new student();
   }
   
   public String toString()
   {
	   return "my reference";
   }
   
   public static List<student> createlist()
   {
	   List<student> list=new ArrayList<student>();
		
		list.add(new student());
		list.add(new student());
		list.add(new student());
		
		return list;
   }
}