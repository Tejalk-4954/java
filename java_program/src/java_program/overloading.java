package java_program;

public class overloading {
	
	public void function1()
	{
		
		System.out.println("function1");
	}
	
	public int function1(int a)
	{
		return a;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overloading ol=new overloading();
		ol.function1(2);
		
	}

}
