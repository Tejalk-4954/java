package java_program;

public class test1 implements test {
	public void show()
	{
		System.out.println("inherited interface");
	}

	public void display()
	{
		System.out.println("inhertited test 3");
	}
	public static void main(String args[])
	{
		test1 t=new test1();
		t.show();
		t.display();
	}
}
