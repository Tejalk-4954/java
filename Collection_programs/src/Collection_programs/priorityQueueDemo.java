package Collection_programs;

import java.util.Iterator;
import java.util.PriorityQueue;

public class priorityQueueDemo {

	public static void main(String[] args) {
		
		PriorityQueue<String> queue=new PriorityQueue<String>();
		queue.add("roy");
		queue.add("tina");
		queue.add("roni");
		queue.add("david");
		System.out.println("head:"+queue.element());
		System.out.println("head:"+queue.peek());
		System.out.println("iterating the queue elememts:");
		
		Iterator itr=queue.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		queue.remove();
		queue.poll();
		System.out.println("after removing two elements:");
		Iterator itr2=queue.iterator();
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
		
	}

}
