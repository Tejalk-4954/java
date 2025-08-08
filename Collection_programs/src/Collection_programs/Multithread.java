package Collection_programs;

public class Multithread extends Thread {
	
	public void run()
	{
		System.out.println("My first thread is running...");
	}

	public static void main(String[] args) {
		
		Multithread mt=new Multithread();
		mt.start();
	}

}
