package multi;

public class Multithreading5_classLevel_Lock {

	public static void main(String[] args) throws InterruptedException {
		Gold gold1=new Gold();
		Gold gold2=new Gold();
		Gold gold3=new Gold();//CLASS LEVEL LOCK

		
		Goldthread gt1=new Goldthread(gold1);
		Goldthread gt2=new Goldthread(gold2);
		Goldthread gt3=new Goldthread(gold3);

        gt1.start();
        gt2.start();
        gt3.start();
        
        gt1.join();
        gt2.join();
        gt3.join();
        
        System.out.println(gold2.getprice());
        System.out.println(gold2.equals(gold3));
        System.out.println(gold1==gold2);
		
	}

}

class Gold
{
   static  int price=100;
    
    public static synchronized void  increase()
    {
    	price++;
    }
    
    public int getprice()
    {
    	return this.price;
    }
    
    public boolean equals(Object o)
    {
    	Gold gold=(Gold)o;
    	return this.price==gold.price;
    }
}

class Goldthread extends Thread
{
   Gold gold;
   
   Goldthread(Gold gold)
   {
	   this.gold=gold;
   }
   
   public void run()
   {
	   for(int i=0;i<100;i++)
	   {
	    gold.increase();
	   }
   }
}