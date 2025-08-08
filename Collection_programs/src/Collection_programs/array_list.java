package Collection_programs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class array_list {

		public static void main(String[] args) {
			ArrayList<String> list1= new ArrayList<String>();
		    list1.add("tej");
		    list1.add("sej");
		    list1.add("harry");
		    
		    ArrayList<Integer> list2=new ArrayList<Integer>();
		    list2.add(10);
		    list2.add(30);
		    list2.add(44);
		    System.out.println(list2.remove(2));
		   System.out.println(list2);
		    //System.out.println(list2.size());
		    Collections.sort(list1);
		    
		   // System.out.println(list1.get(2));
		  
		    
		    
		    for(int i=0;i<list1.size();i++)
		    {
		    	System.out.println(i);
		    }
		    
		    for (String i : list1) {
		        System.out.println(i);
		      }
		    
		    Iterator j=list2.iterator(); //for traversing (alternative to for loop)
		    while(j.hasNext())
		    {
		    	System.out.println(j.next());
		    }
		    }

	}


