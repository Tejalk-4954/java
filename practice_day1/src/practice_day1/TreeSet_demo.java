package practice_day1;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet_demo {
	
	public static void main(String[] args) {
		
	Set<Student> s = new TreeSet();
	
	Student s1 = new Student(1,"teja","tej@gmail");
	Student s2 = new Student(3,"sejal","sej@gmail");
	Student s3 = new Student(2,"ram","rajj@gmail");
	
	s.add(s1);
	s.add(s2);
	s.add(s3);
	
	for(Student i:s) {
		System.out.println(i.name);
	}
	
	}
}

class Student implements Comparable<Student> {
	int id;
	String name;
	String email;
	
	public Student(int id , String name , String email) {
		this.id=id;
		this.name=name;
		this.email=email;
	}

	@Override
	public int compareTo(Student o) {
//		return this.id- o.id; // to print in ascending order 
//		return o.id-this.id;  // print in descending order
		return this.name.length()-o.name.length();// to print length wise
	}
}
