package multi;

public class Multithreading4 {

	public static void main(String[] args) throws InterruptedException {

		Runs run=new Runs();
		Runs run2=new Runs();
		
       PlayerThread first=new PlayerThread(run);
		
		PlayerThread second=new PlayerThread(run2);
		
		SecondThreadable third=new SecondThreadable(run2);
		
		first.start();
		second.start();
		third.start();
		
		first.join();
		second.join();
		third.join();
		
		
		System.out.println(run.getruns());
	    System.out.println("second shared instance between diffrent thread classes::"+run2.getruns());
	    System.out.println("two threads on asynch block::"+run2.asynchronous());
	}

}

class Runs
{
   int run=1500;
   int run2=2000;
   
   public void addruns()
   {
	   synchronized(this)
	   {
		   run++;
	   }
	   run2++;
	   
   }
   
   public int getruns()
   {
	   return this.run;
   }
   
   public int asynchronous()
   {
	   return this.run2;
   }
}

class PlayerThread extends Thread
{
   Runs run;
   
   public PlayerThread ( Runs run)
   {
	   this.run=run;
   }
   
   public void run()
   {
	   for(int i=0;i<500;i++)
	   {
		   run.addruns();
	   }
   }
   
}

class SecondThreadable extends Thread
{
	Runs runs;
	
	public SecondThreadable(Runs runs)
	{
		this.runs=runs;
	}
	
	@Override
	public void run() {
		for(int i=0;i<1000;i++)
		{
			runs.addruns();
		}
	}
	
}

