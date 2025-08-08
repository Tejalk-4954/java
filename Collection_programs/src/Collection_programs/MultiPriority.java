package Collection_programs;

public class MultiPriority extends Thread {
	public void run() {
		System.out.println("running thread name is:"+Thread.currentThread().getName());
		System.out.println("running Thread priority is:"+Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		MultiPriority  m1=new MultiPriority ();
		MultiPriority  m2=new MultiPriority ();
		m1.setPriority(Thread.MIN_PRIORITY);
		m2.setPriority(Thread.MAX_PRIORITY);
		m1.start();
		m2.start();
	}

}
// garbage collection is a way to detstroyed unused variable
//synchronization 