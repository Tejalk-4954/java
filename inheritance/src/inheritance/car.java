package inheritance;

public class car extends vehicle{

	public  void car1()
	{
		System.out.println("car has four wheels");
	}

 public static void main(String args[])
 {
	 car c=new car();
	 c.car1();
	 c.travelling();
 }
}
