package methodreference;

import java.util.ArrayList;
import java.util.List;

public class InstanceReference {

	public static void main(String[] args)
	  {
	      Student student =new Student(1,"ABC","abc@gmail.com",33);
	      
	      List<Student> list=student.createlist();
		     
	      filter_student filter=new filter_student(student);
	      
	      list.stream().filter(filter::filter_stud).forEach((i)->System.out.println(i.email));
		
	  }

}

class Student 
{
   int id;
   String name;
   String email;
   int mark;
   
public Student(int id, String name, String email, int marks) {
	this.id = id;
	this.name = name;
	this.email = email;
	this.mark = marks;
}
   
public List<Student> createlist()
{
  List<Student> list=new ArrayList<Student>();
  
  list.add(this);
  list.add(new Student(this.id+1,this.name+"a",this.email+"a",this.mark+1));
  list.add(new Student(this.id+2,this.name+"b",this.email+"b",this.mark+2));
  list.add(new Student(this.id+3,this.name+"c",this.email+"c",this.mark+3));

     return list;
 }
   
}

class filter_student
{
   Student student;
   
   public filter_student(Student student)
   {
	   this.student=student;
   }
   
   public boolean filter_stud(Student student)
   {
	   if(student.mark>35)
	   {
		   return true;
	   }
	   return false;
   }
	
	
}  
 