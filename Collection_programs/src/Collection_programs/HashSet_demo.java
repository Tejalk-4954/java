package Collection_programs;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_demo {

	public static void main(String[] args) {
		HashSet<String> set =new HashSet<String> ();//create hashset and adding elements
		set.add("ravi");
		set.add("vijay");
		set.add("krish");
		
		//traversing elements
		Iterator<String> itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}

}
