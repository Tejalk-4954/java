package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Assesment {

	public static void main(String[] args) throws StudentExistsException {
		
		Student s1=new Student(1,"riya","riya@gmail.com",88.45,"5463637271",21);
		Student s2=new Student(2,"priya","priya@gmail.com",81.45,"9463437272",21);
		Student s3=new Student(3,"siya","siya@gmail.com",78.23,"846363727",24);
		Student s4=new Student(4,"jiya","jiya@gmail.com",68.4,"7846363727",23);
		Student s5=new Student(5,"kavya","kavya@gmail.com",98.45,"7646363727",22);
		Student s6=new Student(6,"jiva","jiva@gmail.com",56.45,"8976363727",28);

		List<List<Student>> student=new ArrayList<>();
		
		student.add(Arrays.asList(s1));
		student.add(Arrays.asList(s2));
		student.add(Arrays.asList(s3));
		student.add(Arrays.asList(s4));
		student.add(Arrays.asList(s5));
	    student.add(Arrays.asList(s6));

	    Map<String,Double> map=Todo.converter(student);
	    map.forEach((n,p)-> System.out.println("Student name:"+n+" "+"percentage:"+p));
	    
	}
}
class Student
{
  private int id;
  private String name;
  private String email;
  private double percentage;
  private String mobile;
  private int age;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public double getPercentage() {
	return percentage;
}
public void setPercentage(double percentage) {
	this.percentage = percentage;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Student(int id, String name, String email, double percentage, String mobile, int age) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.percentage = percentage;
	this.mobile = mobile;
	this.age = age;
}
   
}

class Todo
{
  public static Map<String,Double> converter(List<List<Student>> students)
  {
	  Set<Integer> set=new HashSet<>();
	 
	  return students.stream().flatMap(List::stream).map(obj->(Student)obj).peek(stud->{
		  if(!set.add(stud.getId()))
		  {
			  throw new RuntimeException(new StudentExistsException("duplicate student found with id:"+stud.getId()));
		  }
	  }).collect(Collectors.toMap(Student::getName, Student::getPercentage));
  }
}

 class StudentExistsException extends Exception
{
	
	public StudentExistsException(String msg)
	{
		super(msg);
	}
}
