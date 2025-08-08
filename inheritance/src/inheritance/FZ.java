package inheritance;

public class FZ extends bike{

	public void func()
	{
		System.out.println("it is new technology bike");
	}
	
	public static void main(String []args)
	{
		FZ f=new FZ();
		f.func();
	}
}
