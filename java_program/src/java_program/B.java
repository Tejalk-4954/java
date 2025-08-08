package java_program;

public class B extends A {
	public B()
	{
		super(51);
		System.out.println("heyy!!");
	}
	public B(int b)
	{
		this();
		System.out.println(b);
		
	}
	

	public static void main(String[] args) {
		B obj=new B(5);
		
		
	}

}
