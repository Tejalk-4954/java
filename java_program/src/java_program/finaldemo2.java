package java_program;

public class finaldemo2 extends finalDemo{
	final int a=12;
	
	
	 void demo()
	{
		System.out.println("in demo method");
	}
	public static void main(String args[]) 
	{
		finaldemo2 fd=new finaldemo2();
		fd.demo();
	}

}
