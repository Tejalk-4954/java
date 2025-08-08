package inheritance;

public class overload {

	
	public void display()
	{
		System.out.println("hello ..i am in display function");
	}
	
	public void display(int a) 
	
	{
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		overload ol=new overload();
		ol.display(20);
		
	}

}
