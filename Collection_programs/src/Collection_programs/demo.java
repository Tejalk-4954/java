package Collection_programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class demo {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
	    list.add(345);
	    list.add(321);
	    list.add(432);
	    list.add(111);
	    list.add(132);
	    
	    Collections.sort(list);
	    Collections.reverse(list);
	    
	    
	    for(int i:list)
	    {
	    	System.out.println(i);
	    }
	}	

}
