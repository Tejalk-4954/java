package DI;

public class dependencyInjection {

	public static void main(String[] args) {
		
	
	Third third=new Third();
	
	Second sec=new Second(third);
    sec.add(100);
	
	}
	
	
}

class Second
{
	Third third;
	
	public Second(Third third)
	{
		this.third=third;
	}
	
	public void add(int i)
	{
		System.out.println("Added:"+(third.getnum()+i));
	}
}

class Third
{
   public int getnum()
   {
	   return 100;
   }
}