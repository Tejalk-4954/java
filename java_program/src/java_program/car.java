package java_program;

public class car extends vehicle{
	public car()
	{
		System.out.println("constructor of car");
	}
	public car(int b)
	{
		this();
		
		System.out.println("paramterized constructor car");
	}
	
	public static void main(String args[])
	{
		car c=new car(4);
		
	}

}
