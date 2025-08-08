package multi;

public class Multithreading1 {

	public static void main(String[] args) throws InterruptedException {
		
		threadone one =new threadone();//instance of classes
		threadtwo two =new threadtwo();
		
		Thread thread1=new Thread(one);
		Thread thread2=new Thread(two);//creating  thread and passing the resources 

		  thread1.start();
		  thread1.join();
		  
		  thread2.start();
		  thread2.join();
		  
		  System.out.println("main executed....");
	}
}


class threadone implements Runnable //thread created by implementing runnable
{

	@Override
	public void run() {
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("custom thread executed...");
		
	}
	
}


class threadtwo implements Runnable
{
    public void run()
    {
    	try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	System.out.println("custom thread executed ....second");
    }
    
}