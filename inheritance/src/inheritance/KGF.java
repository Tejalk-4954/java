package inheritance;

public class KGF extends Action_movies {
	
	public static void display()
	{
		System.out.println("it is action movie");
	}
	
	public KGF()
	{
		System.out.println("constructor KGf");
	}
	
	public static void main(String args[])
	{
		KGF k=new KGF();
	    k.display();
	    k.type();
	    k.use();
	}

}
