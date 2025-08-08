package Collection_programs;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_sum_average {

	public static void main(String[] args) {
		int  sum=0 , avg;
		 ArrayList<Integer> list=new ArrayList<Integer>();
		    list.add(10);
		    list.add(30);
		    list.add(44);
		    
		   
		    
	    
	    for(int i :list)
	    {
	    	sum=sum+i;
	    }
       System.out.println("sum="+sum);
       
      avg=sum/list.size();
      System.out.println("average of the elements::"+avg);
       
	}

}
