package practice_day2;

import java.util.LinkedList;
import java.util.List;

public class LinkedList_Demo {
	
	public static void main(String[] args) {
		
 List<Integer> list =new LinkedList<Integer>();
list.add(12);
list.add(33);
list.add(77);
list.add(4);

System.out.println(list.get(2));//Accessing the element

list.remove(2);//deleteing 

long time=System.nanoTime();
System.out.println("time Required:"+time/1000000000);
	}
}
