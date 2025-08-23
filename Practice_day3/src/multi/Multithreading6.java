package multi;

import java.util.ArrayList;
import java.util.List;

public class Multithreading6 {

	public static void main(String[] args) {
		
		Student st=new Student();
		
		addservice add=new addservice(st);
		
		Removeservice remove=new Removeservice(st);
		
		add.start();
		remove.start();
		
	}

}


class Student
{
	 int rollNo=1;
	 
	 List<Integer> number=new ArrayList<Integer>();
	 
	 public synchronized void addStudent() throws InterruptedException
	 {
		 if(number.size()==5)
		 {
			 System.out.println("..........**Wait for Entering**............");
			 wait();
		 }
		 number.add(rollNo);
		 System.out.println("element added:"+rollNo+"notifying remover");
		 rollNo++;
		 notify();
	 }
	 
	 public synchronized void removeStudent() throws InterruptedException
	 {
		 if(number.size()==0)
		 {
			 System.out.println("SOS************Help me .... reaching 0...entering waiting stage");
				wait();
		 }
		 
		 System.out.println("removing elements"+number.remove(0)+"notifying adder");
		 notify();
	 }
}

class addservice extends Thread
{
	Student student;
	
	addservice(Student student)
	{
		this.student=student;
	}
	
	public void run()
	{
		try {
			student.addStudent();
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}


class Removeservice extends Thread
{
	Student student;
	
	Removeservice(Student student)
	{
		this.student=student;
	}
	
	public void run()
	{
		try {
			student.removeStudent();
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}