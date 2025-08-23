package multi;

public class Multithreading3 {

	public static void main(String[] args) throws InterruptedException {
		
		Distance dt=new Distance();
		
		Distance dt2=new Distance();

		threadone1 t1=new threadone1(dt);

		threadone1 t2=new threadone1(dt);//mutual synchronization because same instace pass between two thread
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		
		System.out.println(dt.km);
	}

}


class Distance
{
   int km=100;
   
   public synchronized void increase()
   {
	   km++;
	   
   }
   
   public void printkm()
   {
	 System.out.println(km);   
   }
   
}

class threadone1 extends Thread
{
	 Distance distance;
	 
	 public threadone1( Distance distance)
	 {
		 this.distance=distance;
	 }
	 
	 @Override
	public void run() {
		for(int i=0;i<10;i++)
		{
			distance.increase();
		}
	}
}