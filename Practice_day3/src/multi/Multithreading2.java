package multi;

public class Multithreading2 {

	public static void main(String[] args) throws InterruptedException {
		
		Counter counts=new Counter();
		
		thread_one one =new thread_one(counts);
		thread_one two =new thread_one(counts);
		
		one.start();
        two.start();
        one.join();
        two.join();
        
        counts.getcount();//data inconsistent ,race condition occur
	}

}

class Counter
{
	
   int count=1;
   
   public void increment()
   {
	   count++;
   }
   
   public void getcount()
   {
	   System.out.println(this.count);
   }
}

class thread_one extends Thread
{
	Counter counter;
	
	public thread_one(Counter count2)
	{
		this.counter=count2;
	}
	
	public void run()
	{
		for(int i=0;i<500;i++)
		{
			counter.increment();
		}
	}
}
