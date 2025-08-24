package multi;

public class volatiledemo1 {
	
	volatile static boolean flag=false;
	
 public static void main(String[] args) throws InterruptedException {
	
	 Thread th=new Thread()
			 {
		 
		 public void run()
		 {
			 try {
				Thread.sleep(10);
				flag=true;
				System.out.println("set flag to true..");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
	};
	
	Thread th2=new Thread()
	{
  public void run()
  
  {
	 while(true) {
	  if(!flag)
	  {
		  while(!flag) {
			  
		  }
		  System.out.println("waiting for the flag to become the true");
		  
	  }
	  else
	  {
		  System.out.println("flag set to true..executing...");
		  break;
	  }
	 }
  
}};

th.start();
th2.start();

th.join();
th2.join();
}


	}

